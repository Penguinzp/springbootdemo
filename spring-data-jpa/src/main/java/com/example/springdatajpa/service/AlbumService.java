package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Album;

import java.util.List;

public interface AlbumService {
    /**
     * 按相册喜欢数获取热门相册
     * @return
     */
    List<Album> getHotAlbums();
}
