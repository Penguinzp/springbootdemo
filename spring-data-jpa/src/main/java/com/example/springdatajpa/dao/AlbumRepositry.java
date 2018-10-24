package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlbumRepositry extends JpaRepository<Album, Integer> {

    /**
     * 自定义查询，得到按照相册的喜欢数降序排列
     */
    @Query("FROM Album  a ORDER BY a.likes DESC ")
    List<Album> findHotAlbums();
}
