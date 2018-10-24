package com.example.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 创建Student持久化类
 * 1.使用@Entity注解实现实体类的持久化，JPA检测到之后，可以在数据库中生成对应的表
 * 2.使用@Id指定主键
 * 3.使用 @GeneratedValue指定主键策略，mqsql默认自增
 * 4.使用@Data简化get/set
 */
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue
    private Integer id;

    private String stuName;

    private Integer stuAge;
}
