package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Carousel;
import com.example.springdatajpa.entity.Topic;
import com.example.springdatajpa.service.ArticleService;
import com.example.springdatajpa.service.CarouselService;
import com.example.springdatajpa.service.TopicService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class IndexController {
    @Resource
    private TopicService topicService;
    @Resource
    private CarouselService carouselService;


    @GetMapping("/carousel/list")
    public List<Carousel> getCarousels() {
        List<Carousel> carouselList = carouselService.getAll();
        return carouselList;
    }

    @GetMapping("/topic/list")
    public List<Topic> getTopics() {
        List<Topic> topicList = topicService.getAll();
        return topicList;
    }
}
