package com.lovo.springboot.service.impl;

import com.lovo.springboot.dao.IUserDao;
import com.lovo.springboot.entity.UserEntity;
import com.lovo.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "userService")
public class UserServiceImpl implements IUserService {
   @Autowired
    IUserDao userDao;
    public List<UserEntity> findAll() {
        return userDao.getListUser();
    }
}
