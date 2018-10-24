package com.example.demo.config;

import org.springframework.stereotype.Component;


import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * websocket服务端
 */
@ServerEndpoint("/websocket")
@Component
public class WebSocketServer {
    private static int onlineCount = 0;

    private static CopyOnWriteArraySet<WebSocketServer> webSocketset =
            new CopyOnWriteArraySet<WebSocketServer>();

    private Session session;

    @OnOpen
    public void onOpen(Session session){
        this.session = session;
        webSocketset.add(this);
        addOnlineCount();
        System.out.println("有新窗口开始监听,当前在线人数为" + getOnlineCount());
        try {
            sendMessage("连接成功");
        } catch (IOException e) {
            System.out.println("WebSocket IO异常");
        }
    }

    @OnClose
    public void onClose(){
        webSocketset.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
        System.out.println("有连接关闭！当前在线人数为" + getOnlineCount());
    }
    @OnMessage
    public void onMessage(String message, Session session) {
        System.out.println("收到客户端的信息:" + message);
        //群发消息
        for (WebSocketServer item : webSocketset) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);
    }


    /**
     * 群发自定义消息
     */
    public static void sendInfo(String message) throws IOException {
        System.out.println("推送消息内容:" + message);
        for (WebSocketServer item : webSocketset) {
            try {
                item.sendMessage(message);
            } catch (IOException e) {
                continue;
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }
}