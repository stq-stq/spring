package com.example.springbootquickstart.service.impl;
import com.example.springbootquickstart.pojo.EmailProperties;
import com.example.springbootquickstart.service.EmailService;
import com.example.springbootquickstart.utils.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    //注入email配置信息实体类
    @Autowired
    private EmailProperties emailProperties;
    /**
     * @param to 收件人邮箱
     * @param title 邮箱标题
     * @param content 邮件正文
     * @return
     */
    @Override
    public boolean send(String to, String title, String content){
        //打印email配置信息
        System.out.println(emailProperties);
        //发送邮件
        boolean flag = MailUtil.sendMail(emailProperties,to,title,content);
        return flag;
    }
}
