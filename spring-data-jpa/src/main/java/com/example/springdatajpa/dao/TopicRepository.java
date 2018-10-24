package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, String> {

    Topic findByTopicName(String topicName);
}
