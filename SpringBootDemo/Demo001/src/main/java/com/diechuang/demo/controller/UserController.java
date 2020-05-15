package com.diechuang.demo.controller;


import com.diechuang.demo.entiy.User;
import com.diechuang.demo.service.UserService;
import com.diechuang.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserServiceImpl userServiceimp;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }
    @RequestMapping("/userMapper")
    @ResponseBody
    public String userMapper(){
        List<User> users = userService.llaUSer();
        for (User user : users) {
            System.out.println(user.getId());
        }
       return users.toString();
    }

    @RequestMapping("/userMapper2")
    @ResponseBody
    public String userMapper2(){
        List<User> users = userServiceimp.llaUSer();
        for (User user : users) {
            System.out.println(user.getUsername());
        }
        return users.toString();
    }

}
