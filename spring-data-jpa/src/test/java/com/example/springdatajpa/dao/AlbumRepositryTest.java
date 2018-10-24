package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositryTest {
    @Resource
    private AlbumRepositry albumRepositry;

    @Test
    public void initData() {
        Album[] albums = {
                new Album("//upload-images.jianshu.io/upload_images/4237685-8960ae10f228c7fb.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/300/h/240", "系统", "让你不会装双系统也能用上双系统。", 210),
                new Album("https://wx1.sinaimg.cn/crop.0.69.500.375.240/007cBmkrly4fvqcunzv9yj30dw0jfjss.jpg", "时尚", "10.1国庆了，我们的服饰要穿出庄重的贵族范。", 333),
                new Album("https://wx1.sinaimg.cn/crop.0.82.600.450.240/007ehyDWly4fvqcgzhsnhj30go0n1gmb.jpg", "时尚", "汉服改良后你穿吗？", 1663),
                new Album("https://wx1.sinaimg.cn/crop.35.0.569.427.240/88734ee3ly4fvq43gzkd4j20hs0bvq2u.jpg", "生活", "顺境善待别人，逆境善待自己。", 523),
                new Album("https://wx3.sinaimg.cn/crop.125.0.749.562.240/006TOGdpgy1fvqa9ns2xij30rs0fmkie.jpg", "科技", "我们的目标是没有刘海！iPhone未来新思路，让前置摄像头“消失”。", 2888),
                new Album("https://wx2.sinaimg.cn/crop.68.0.480.360.240/006Zkr5Ily1fvq552qq3uj30h50a0jxb.jpg", "科技", "戴在手腕上的柔性屏智能手机Smile。", 977)
        };
        for (int i = 0; i < 6; i++) {
            albumRepositry.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums() {
        List<Album> albumList = albumRepositry.findHotAlbums();
        albumList.forEach(album -> System.out.println(album));
    }
}