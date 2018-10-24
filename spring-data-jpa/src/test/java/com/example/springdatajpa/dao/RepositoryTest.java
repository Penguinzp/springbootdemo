package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.Article;
import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.entity.Topic;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Resource
    private TopicRepository topicRepository;

    @Resource
    private ArticleResopitory articleResopitory;


    @Test
    public void test() throws Exception {

        // 创建6条用户记录
        SysUser[] users = {
                new SysUser("aaa@qq.com", "111", "简书大学堂", 1129),
                new SysUser("bbb@qq.com", "222", "宇文欢", 897),
                new SysUser("ccc@qq.com", "333", "一只枝", 776),
                new SysUser("ddd@qq.com", "444", "lostdays", 666),
                new SysUser("eee@qq.com", "555", "十七楼的安素", 433),
                new SysUser("fff@qq.com", "666", "徐林Grace", 112)
        };

        //创建6条专题记录
        Topic[] topics = {
                new Topic("读书", "https://goo.gl/VLUQEk", "读书专题仅收录与读书有关的书评、读书笔记、阅读方法、读书清单等文章。", 180990, 3412050),
                new Topic("手绘", "https://goo.gl/i6NE3A", "本专题是绘画爱好者的乐园，欢迎互相分享学习。", 126355, 1590757),
                new Topic("摄影", "https://goo.gl/bYQwPy", "每个人都是独特的艺术家 ，用快门捕捉你双眼所见，心有所感的一切 。", 68397, 1897602),
                new Topic("故事", "https://goo.gl/xprKt8", "故事专题，不论是旅行生活中亲身经历的真实故事，还是童话玄幻遐想的虚构故事，这里记录你的每个故事。", 194131, 1258046),
                new Topic("旅行", "https://goo.gl/H4S3yj", "邂逅一个国家，讲述一座城市，这里有你期待的诗与远方。", 104079, 2487321),
                new Topic("读电影", "https://goo.gl/k2AzWM", "本专题收录电影相关文章。要求文内不得带有公众号信息等推广内容。", 88172, 1809302),
        };

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
//            userRepository.save(users[i]);
//            topicRepository.save(topics[i]);
            articleResopitory.save(articles[i]);
        }


        // 测试findAll, 查询所有记录
//        Assert.assertEquals(6, userRepository.findAll().size());

        // 测试findByName, 查询姓名为FFF的User
//        System.out.println(userRepository.findByName("FFF"));

        // 测试findByNameAndAge, 查询姓名为FFF并且年龄为60的User
//        System.out.println(userRepository.findByNameAndAge("FFF",60));

        // 测试findUser, 查询姓名为FFF的User
//        System.out.println(userRepository.findUser("FFF"));

        // 测试删除姓名为AAA的User
//        userRepository.delete(userRepository.findByName("AAA"));


    }
}