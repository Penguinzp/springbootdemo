package com.example.springdatajpa.entity;

import io.swagger.models.auth.In;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
public class SysUser implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(nullable = false)
    private String account;

    @Column(nullable = false)
    private String password;

    private String nickname;

    private Integer fans;

    public SysUser(String account, String password, String nickname, Integer fans) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.fans = fans;
    }

    public SysUser() {
    }
}
