package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.BookRepository;
import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Book 业务层实现
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(long id) {
        return bookRepository.findById(id).get();
    }
}
