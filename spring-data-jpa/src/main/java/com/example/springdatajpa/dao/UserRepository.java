package com.example.springdatajpa.dao;

import com.example.springdatajpa.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 继承JpaRepository，默认已经具备创建（save）、更新（save）、删除（delete）、查询（findAll、findOne）等基本功能
 */
public interface UserRepository extends JpaRepository<SysUser, Integer> {

    //根据账号精确查询用户，采用的是通过解析方法名创建查询
    SysUser findByAccount(String account);

    //根据昵称关键词查询用户，采用的是通过解析方法名创建查询
    List<SysUser> findByNicknameLike(String keywords);

    //查询昵称含有指定关键词并且按粉丝数降序排列，采用自定义的JPQL查询
    @Query("from SysUser u where u.nickname  like CONCAT('%',:nickname,'%') order by  u.fans desc ")
    List<SysUser> findUsers(@Param("nickname") String nickname);
}
