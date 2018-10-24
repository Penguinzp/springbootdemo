package com.niit.quickstart.dao;

import com.niit.quickstart.entity.Card;
import com.niit.quickstart.entity.User;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * 卡片数据访问类，需要被注入，所以采用@Configuration注解
 * 同时采用@Data简化代码
 */
@Configuration
@Data
public class CardDAO {
    //该方法返回所有Card对象组成的List集合
    public List<Card> getCards() {
        //定义一个含有若干匿名Card对象的Card类型数组
        Card[] cards = {
                new Card("1.jpg", "自由"),
                new Card("2.jpg", "JOIN US"),
                new Card("3.jpg", "DISCO PARTY"),
                new Card("4.jpg", "MAKE PROGRESS"),
                new Card("5.jpg", "STARS"),
                new Card("6.jpg", "SEE THE WORLD"),
                new Card("7.jpg", "JAZZ"),
                new Card("8.jpg", "DISCOVER"),
                new Card("1.jpg", "TEST")
        };
        //通过Arrays.asList方法，将数组转换成List
        List<Card> cardList = Arrays.asList(cards);
        return cardList;
    }

    //该方法返回用户对象
    public User getUser() {
        User user = new User();
        user.setName("陶然然");
        user.setAvatar("me.jpg");
        return user;
    }
}
