package com.example.demo.controller;


import com.example.demo.config.WebSocketServer;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class webSocketController {
    public String pushMsg(String message) {
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
}