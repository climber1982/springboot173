package com.lovo.springboot.controller;

import com.lovo.springboot.entity.UserEntity;
import com.lovo.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private  UserEntity userBean;
    @RequestMapping("testInfo")
    public String testInfo(){
      return   userBean.getUserName();

    }
    @RequestMapping("getListUser")
    public List<UserEntity> getListUser(){
        return userService.findAll();
    }


}
