package com.example.config;
import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    @Bean//将方法返回值交给IOC容器管理，成为IOC容器的bean对象
    public Country country(){
        return new Country();
    }

    //对象默认的名字是方法名 改名字只需要在Bean后面加（“”）
    //如果方法的内部需要使用到ioc容器中已经存在的bean对象，那么只需要在方法上声明即可，spring会自动注入
    @Bean
    public Province province(Country country){
        System.out.println("province:"+country);
        return new Province();
    }
}
