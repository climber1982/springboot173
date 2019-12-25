package com.lovo.springboot.service.impl;

import com.lovo.springboot.dao.IUserDao;
import com.lovo.springboot.entity.UserEntity;
import com.lovo.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements IUserService {
   @Autowired
    IUserDao userDao;
    public List<UserEntity> findAll() {
        return userDao.getListUser();
    }

    @Override
    public void savaUser(UserEntity user) {
        userDao.save(user);
    }

    @Override
    public UserEntity findUserById(String id) {
        return userDao.findById(id).get();
    }
}
