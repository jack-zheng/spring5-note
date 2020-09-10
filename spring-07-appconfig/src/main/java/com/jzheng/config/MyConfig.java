package com.jzheng.config;

import com.jzheng.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration //表示一个配置类，和 xml 功能一样
@ComponentScan("com.jzheng.pojo")
@Import(MyConfig02.class)
public class MyConfig {

    @Bean
    public User getUser() { // 方法名和 id 类似
        return new User();
    }
}
