package com.example.springdatajpa.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Carousel {
    @Id
    @GeneratedValue
    private Integer id;

    private String imgUrl;

}
