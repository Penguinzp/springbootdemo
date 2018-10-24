package com.example.springdatajpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 话题可持久化类
 */
@Entity
@Data
public class Topic implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    //专题名称
    private String topicName;

    //专题logo
    private String topicLogo;

    //专题描述
    private String topicDesc;

    //文章数
    private Integer articles;

    //关注数
    private Integer follows;

    //映射一对多的关联关系,默认使用懒加载。cascade设置级联删除。
    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.REMOVE})
    //外键
    @JoinColumn(name = "topic_id")
    private List<Article> articleList;

    public Topic(String topicName, String topicLogo, String topicDesc, Integer articles, Integer follows) {
        this.topicName = topicName;
        this.topicLogo = topicLogo;
        this.topicDesc = topicDesc;
        this.articles = articles;
        this.follows = follows;
    }

    public Topic() {
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
