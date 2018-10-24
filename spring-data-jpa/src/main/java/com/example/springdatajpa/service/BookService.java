package com.example.springdatajpa.service;



import com.example.springdatajpa.entity.Book;

import java.util.List;

/**
 * Book 业务接口层
 */
public interface BookService {
    /**
     * 获取所有 Book
     */
    List<Book> findAll();


    /**
     * 获取 Book
     *
     * @param id 编号
     */
    Book findById(long id);
}
