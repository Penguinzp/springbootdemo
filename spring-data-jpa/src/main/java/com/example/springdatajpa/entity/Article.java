package com.example.springdatajpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 文章可持久化类
 */
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue
    private Integer id;

    //标题
    private String title;

    //内容
    private String content;

    //缩略图
    private String thumbnail;

    //作者账号
    private String userAccount;

    //评论数
    private Integer comments;

    //喜欢数
    private Integer likes;

    public Article(String title, String content, String thumbnail, String userAccount, Integer comments, Integer likes) {
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.userAccount = userAccount;
        this.comments = comments;
        this.likes = likes;
    }

    public Article() {
    }
}
