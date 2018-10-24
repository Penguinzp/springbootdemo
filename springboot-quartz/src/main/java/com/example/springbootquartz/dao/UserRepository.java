package com.example.springbootquartz.dao;

import com.example.springbootquartz.entity.Sport;
import com.example.springbootquartz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByAccountAndPassword(String account, String password);

    User findByAccount(String account);
}
