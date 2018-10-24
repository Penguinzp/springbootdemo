package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleResopitory extends JpaRepository<Article, Integer> {
    @Query("FROM Article a ORDER BY a.likes DESC")
    List<Article> findByLikesOrderByLikes();
}
