package com.niit.quickstart.controller;

import com.niit.quickstart.dao.CardDAO;
import com.niit.quickstart.entity.Card;
import com.niit.quickstart.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 卡片控制器类
 * 通过ModelMap将数据带回页面
 */
@Controller
public class CardController {

    //注入CardDAO的bean
    @Resource
    private CardDAO cardDAO;

    @GetMapping("card")
    public String getAll(ModelMap map) {
        //从CardDAO的bean获取到所有卡片数据和用户信息数据
        List<Card> cardList = cardDAO.getCards();
        User user = cardDAO.getUser();
        //将数据模型加入视图
        map.addAttribute("cardList", cardList);
        map.addAttribute("user", user);
        return "card";
    }
}
