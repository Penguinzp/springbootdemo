package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.Topic;

import java.util.List;

public interface TopicService {
    Topic findByTopicName(String topicName);

    List<Topic> getAll();
}
