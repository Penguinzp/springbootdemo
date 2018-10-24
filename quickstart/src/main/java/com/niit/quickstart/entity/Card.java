package com.niit.quickstart.entity;

import lombok.Data;

/**
 * 卡片类，就是一个简单的实体类，无需被注入
 * 采用@Data简化代码
 */
@Data
public class Card {
    private String imgLink;
    private String title;

    public Card() {
    }

    public Card(String imgLink, String title) {
        this.imgLink = imgLink;
        this.title = title;
    }
}
