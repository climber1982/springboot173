package com.lovo.springboot.service;

import com.lovo.springboot.entity.UserEntity;
import org.apache.catalina.User;

import java.util.List;

public interface IUserService {

    public List<UserEntity> findAll();

    public  void savaUser(UserEntity user);

    public UserEntity findUserById(String id);
}
