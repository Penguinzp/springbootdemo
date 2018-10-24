package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleServiceTest {

    @Resource
    private ArticleService articleService;

    @Test
    public void getHotArticles() {
        List<Article> articleList = articleService.getHotArticles();
        articleList.forEach(article -> System.out.println(article));
    }
}