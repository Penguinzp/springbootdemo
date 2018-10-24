package com.example.springbootquartz.entity;

import com.example.springbootquartz.dao.SportRepository;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import java.util.List;

public class Jobs {
    @Resource
    private SportRepository sportRepository;

    public static List<Sport> rankingList = null;

    @Scheduled(cron = "0 31 8 * * ?")
    public void ranking() {
        rankingList = sportRepository.getAll();
        System.out.println(rankingList);
    }

    public List<Sport> rank() {
        return rankingList;
    }
}
