package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Resource
    private UserRepository userRepository;

    @Test
    public void initData() {
        // 创建6条用户记录
        SysUser[] users = {
                new SysUser("aaa@qq.com", "111", "简书大学堂", 1129),
                new SysUser("bbb@qq.com", "222", "宇文欢", 897),
                new SysUser("ccc@qq.com", "333", "一只枝", 776),
                new SysUser("ddd@qq.com", "444", "lostdays", 666),
                new SysUser("eee@qq.com", "555", "十七楼的安素", 433),
                new SysUser("fff@qq.com", "666", "徐林Grace", 112)
        };
        for (int i = 0; i < 6; i++) {
            userRepository.save(users[i]);
        }
    }

    @Test
    public void findAll() {
        List<SysUser> users = userRepository.findAll();
        users.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void findOne() {
        SysUser user = userRepository.findById(21).get();
        System.out.println(user);
    }

    @Test
    public void findByAccount() {
        SysUser sysUser = userRepository.findByAccount("aaa@qq.com");
        System.out.println(sysUser);
    }

    @Test
    public void findByNicknameLike() {
        List<SysUser> users = userRepository.findByNicknameLike("%@qq%");
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void findUsers() {
        List<SysUser> users = userRepository.findUsers("简");
        users.forEach(sysUser -> System.out.println(sysUser));
    }

}