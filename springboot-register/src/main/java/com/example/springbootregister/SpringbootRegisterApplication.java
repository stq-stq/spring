package com.example.springbootregister;

import cn.itcast.pojo.Country;
import com.example.anno.EnableCommonConfig;
import com.example.config.CommonConfig;
import com.example.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@Import({CommonConfig.class})//将config移到外部，spring将这个bean对象放到s容器里
//@Import(CommonImportSelector.class)封装注解可以新建一个java类将注解写在里面然后引入下面这一行
@EnableCommonConfig
public class SpringbootRegisterApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringbootRegisterApplication.class, args);
        //调用容器context对象的getBean方法
        Country country = context.getBean(Country.class);
        //如果可以正常输出证明注入成功
        System.out.println(country);

        System.out.println(context.getBean("province"));
    }


    //注入country对象,建议在配置里注册
//    @Bean//将方法返回值交给IOC容器管理，成为IOC容器的bean对象
//    public Country country(){
//        return new Country();
//    }
}
