package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceTest {

    @Resource
    private BookService bookService;

    @Test
    public void findAll() {
        List<Book> bookList = bookService.findAll();
        bookList.forEach(book -> System.out.println(book));
    }

    @Test
    public void findById() {
        System.out.println(bookService.findById(1));
    }
}