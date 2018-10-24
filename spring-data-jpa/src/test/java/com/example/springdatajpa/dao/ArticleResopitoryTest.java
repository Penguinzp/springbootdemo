package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleResopitoryTest {
    @Resource
    private ArticleResopitory articleResopitory;

    @Test
    public void initData() {
        //创建6条读书专题的文章记录
        Article[] articles = {
                new Article(
                        "活了100万次的猫",
                        "买了一本儿童文学，只是因为爱猫。 收到之后，被里面的图画设计深深吸引着，好喜欢，每一张水彩画都好精美...",
                        "https://goo.gl/mWX7NW",
                        "aaa@qq.com",
                        8,
                        7),
                new Article(
                        "活红楼里的小人物之贾瑞",
                        "贾瑞第一次出现是在《红楼梦》第九回恋风流情友入家塾起嫌疑顽童闹学堂，“可巧这日代儒有事，早已回家去了。又留下一句七言对联，命学生对了，明日再来上...",
                        "https://goo.gl/YtHQQn",
                        "bbb@qq.com",
                        5,
                        1),
                new Article(
                        "关于个人成长的思考",
                        "在《元认知》这本书的开始，写着这样一段话：所谓命运，实际上是我们的性格造成的。倘若我们勇敢地去探寻性格影响命运的过程，就会发现性格其实能够改变，...",
                        "https://goo.gl/RVE6Za",
                        "ccc@qq.com",
                        4,
                        1),
                new Article(
                        "我眼中的白鹿原",
                        "《白鹿原》的扉页上有法国19世纪著名作家，法国现实主义文学成就最高者奥诺雷·德·巴尔扎克写的一句话，“小说被认为是一个民族的密史。”带着这句话，...",
                        "https://goo.gl/8zHt83",
                        "ddd@qq.com",
                        3,
                        2),
                new Article(
                        "“临界点”——《游戏力2》读书笔记",
                        "三个场景 关键词：临界点 萌萌5个月，处在认生阶段，每晚爸爸回来的时候，喜欢跟爸爸玩，但是得我抱着才愿意跟爸爸放心玩。 有时看她玩得投入，就交给...",
                        "https://goo.gl/nbSRrX",
                        "eee@qq.com",
                        0,
                        1),
                new Article(
                        "关于生命的意义这是我听过的最好的答案",
                        "1 依稀记得，几年前下班后与好友相约去她家，点上熏香，煮上茶，我们面对面坐着，聊工作、聊生活、聊身边的人事物… 突然，她抛出了那个一直困扰她的问...",
                        "https://goo.gl/d1u8LL",
                        "fff@qq.com",
                        2,
                        1)

        };
        for (int i = 0; i < 6; i++) {
            articleResopitory.save(articles[i]);
        }
    }

}