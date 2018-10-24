package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Album;
import com.example.springdatajpa.service.AlbumService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping("/list")
    public List<Album> getAlbums() {
        return albumService.getHotAlbums();
    }
}
