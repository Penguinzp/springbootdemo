package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Article;

import java.util.List;

public interface ArticleService {
    List<Article> getHotArticles();
}
