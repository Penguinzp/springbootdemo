package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 相册类
 */
@Entity
@Data
public class Album {
    @Id
    @GeneratedValue
    private Integer id;

    private String albumCover;

    private String albumTitle;

    private String albumDescription;

    private Integer likes;

    public Album(String albumCover, String albumTitle, String albumDescription, Integer likes) {
        this.albumCover = albumCover;
        this.albumTitle = albumTitle;
        this.albumDescription = albumDescription;
        this.likes = likes;
    }

    public Album() {
    }
}
