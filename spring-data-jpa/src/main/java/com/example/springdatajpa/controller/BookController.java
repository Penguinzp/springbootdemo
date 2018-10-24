package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Book;
import com.example.springdatajpa.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Book 控制层
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    //用常量定义跳转的页面名称
    private static final String BOOK_DETAIL_PATH_NAME = "bookDetail";
    private static final String BOOK_LIST_PATH_NAME = "bookList";

    @Resource
    BookService bookService;

    /**
     * 处理 "/book/all" 的 GET 请求，用来获取 Book 列表
     * 数据存入ModelMap，返回Thymeleaf页面
     */
    @GetMapping("/all")
    public String getBookList(ModelMap map) {
        map.addAttribute("bookList", bookService.findAll());
        return BOOK_LIST_PATH_NAME;
    }

    /**
     * 处理 "/book/{id}" 的 GET 请求，获取指定id的Book信息
     * 返回单个数据的模板页面
     */
    @GetMapping(value = "/{id}")
    public String getBook(@PathVariable Long id, ModelMap map) {
        map.addAttribute("book", bookService.findById(id));
        return BOOK_DETAIL_PATH_NAME;
    }
}
