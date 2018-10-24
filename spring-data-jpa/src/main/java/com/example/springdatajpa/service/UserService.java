package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.SysUser;

import java.util.List;

public interface UserService {

    //查询所有用户
    List<SysUser> getAll();

    //根据id查询用户
    SysUser getUser(Integer id);

    //根据账号精确查询用户
    SysUser getUserByAccount(String account);

    //根据昵称关键词查询用户
    List<SysUser> getUsersByNicknameLike(String keywords);

    //查询昵称含有指定关键词并且按粉丝数降序排列
    List<SysUser> getUsersOrderByFans(String nickname);

}
