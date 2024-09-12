package com.example.springbootquickstart.controller;

import com.example.springbootquickstart.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World";
//    }
    //注入Email配置信息实体类
    @Autowired
    private EmailService emailService;
    //测试方法
    @RequestMapping("/send")
    public Boolean send() {
        //收件人信箱
        String to = "3086520785@qq.com";
        //邮件标题
        String title = "测试邮件";
        //邮件正文
        String contend = "我是谁？";
        //发送邮件
        boolean flag = emailService.send(to, title, contend);
        return flag;
    }
}
