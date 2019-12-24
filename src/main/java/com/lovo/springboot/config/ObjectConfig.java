package com.lovo.springboot.config;

import com.lovo.springboot.entity.UserEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectConfig {
    @Bean(value = "userBean")
    public UserEntity createBean(){
        UserEntity user=new UserEntity();
        user.setUserId("1");
        user.setUserName("赵云");
        return user;
    }
}
