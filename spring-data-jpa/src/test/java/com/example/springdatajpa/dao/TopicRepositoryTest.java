package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Topic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicRepositoryTest {

    @Resource
    private TopicRepository topicRepository;

    @Test
    public void initData() {
        //创建6条专题记录
        Topic[] topics = {
                new Topic("读书", "https://goo.gl/VLUQEk", "读书专题仅收录与读书有关的书评、读书笔记、阅读方法、读书清单等文章。", 180990, 3412050),
                new Topic("手绘", "https://goo.gl/i6NE3A", "本专题是绘画爱好者的乐园，欢迎互相分享学习。", 126355, 1590757),
                new Topic("摄影", "https://goo.gl/bYQwPy", "每个人都是独特的艺术家 ，用快门捕捉你双眼所见，心有所感的一切 。", 68397, 1897602),
                new Topic("故事", "https://goo.gl/xprKt8", "故事专题，不论是旅行生活中亲身经历的真实故事，还是童话玄幻遐想的虚构故事，这里记录你的每个故事。", 194131, 1258046),
                new Topic("旅行", "https://goo.gl/H4S3yj", "邂逅一个国家，讲述一座城市，这里有你期待的诗与远方。", 104079, 2487321),
                new Topic("读电影", "https://goo.gl/k2AzWM", "本专题收录电影相关文章。要求文内不得带有公众号信息等推广内容。", 88172, 1809302),
        };
        for (int i = 0; i < 6; i++) {
            topicRepository.save(topics[i]);
        }
    }

    @Test
    public void findByTopicName() {
        Topic topic = topicRepository.findByTopicName("读书");
        System.out.println(topic);
    }
}