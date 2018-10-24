package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.Topic;
import com.example.springdatajpa.service.TopicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/topic")
public class TopicController {
    @Resource
    private TopicService topicService;

    @GetMapping("/name")
    public Topic getTopicByName(@RequestParam String topicName) {
        return topicService.findByTopicName(topicName);
    }
}
