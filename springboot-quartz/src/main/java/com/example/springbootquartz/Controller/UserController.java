package com.example.springbootquartz.Controller;


import com.example.springbootquartz.dao.SportRepository;
import com.example.springbootquartz.dao.UserRepository;
import com.example.springbootquartz.entity.Jobs;
import com.example.springbootquartz.entity.Sport;
import com.example.springbootquartz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserRepository userRepository;
    @Resource
    private SportRepository sportRepository;

    private User user = new User();
    private Sport sport = new Sport();
    private Jobs jobs = new Jobs();


    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        user = userRepository.findByAccountAndPassword(username, password);
        sport = sportRepository.findSportByAccount(username);
        String str = "";
        if (user != null) {
            session.setAttribute("userLogin", user);
            session.setAttribute("steps", sport);
            session.setAttribute("ranking", jobs.rank());
            str = "home";
        } else {
            str = "index";
        }
        return str;
    }
}