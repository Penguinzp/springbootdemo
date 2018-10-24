package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.ArticleResopitory;
import com.example.springdatajpa.entity.Article;
import com.example.springdatajpa.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleResopitory articleResopitory;
    @Override
    public List<Article> getHotArticles() {
        return articleResopitory.findByLikesOrderByLikes();
    }
}
