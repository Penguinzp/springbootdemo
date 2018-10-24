package com.example.springdatajpa.service.impl;

import com.example.springdatajpa.dao.UserRepository;
import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;


    @Override
    public List<SysUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    public SysUser getUser(Integer id) {
        return userRepository.findById(id).get();
    }

    @Override
    public SysUser getUserByAccount(String account) {
        return userRepository.findByAccount(account);
    }

    @Override
    public List<SysUser> getUsersByNicknameLike(String keywords) {
        return userRepository.findByNicknameLike(keywords);
    }


    @Override
    public List<SysUser> getUsersOrderByFans(String nickname) {
        return userRepository.findUsers(nickname);
    }
}
