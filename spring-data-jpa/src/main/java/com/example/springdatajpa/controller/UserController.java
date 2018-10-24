package com.example.springdatajpa.controller;

import com.example.springdatajpa.entity.SysUser;
import com.example.springdatajpa.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 映射 /user/all请求，获取所有用户数据
     * @return
     */
    @GetMapping("/all")
    public List<SysUser> getAll() {
        return userService.getAll();
    }

    /**
     * 映射 /user/{id}请求，获取指定id的用户数据 ，具体的id值可以直接放在地址url里传递
     * @return
     */
    @GetMapping("/{id}")
    public SysUser getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    /**
     * 映射 /user/account请求，获取指定账户的用户数据，需要传递一个用户账号参数
     * @return
     */
    @GetMapping("/account")
    public SysUser getUserByAccount(@RequestParam String account) {
        return userService.getUserByAccount(account);
    }

    /**
     * 映射 /user/nickname请求，获取根据昵称关键词查询的用户数据，需要传递一个昵称关键词作为参数，且因为是第二种方法，参数需要：%简书%的形式
     * @return
     */
    @GetMapping("/nickname")
    public List<SysUser> getUsersByNicknameLike(@RequestParam String keywords) {
        return userService.getUsersByNicknameLike(keywords);
    }

    /**
     * 映射 /user/order请求，获取根据昵称关键词查询并按粉丝数降序排列的用户数据，需要传递一个昵称关键词作为参数，自己写的查询，参数只需要传递字符串
     * @return
     */
    @GetMapping("/order")
    public List<SysUser> getUsersOrderByFans(@RequestParam String nickname) {
        return userService.getUsersOrderByFans(nickname);
    }

}
