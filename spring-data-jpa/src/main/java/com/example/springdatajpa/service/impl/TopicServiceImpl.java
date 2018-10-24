package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.TopicRepository;
import com.example.springdatajpa.entity.Topic;
import com.example.springdatajpa.service.TopicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    @Resource
    private TopicRepository topicRepository;

    @Override
    public Topic findByTopicName(String topicName) {
        return topicRepository.findByTopicName(topicName);
    }

    @Override
    public List<Topic> getAll() {
        return topicRepository.findAll();
    }
}
