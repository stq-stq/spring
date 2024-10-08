package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.pojo.User;
import com.example.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    //注入service
    @Autowired
    private UserService userService;

    @RequestMapping("/findById")
    //方法
    public User findById(Integer id){
        return userService.findById(id);
    }

}
