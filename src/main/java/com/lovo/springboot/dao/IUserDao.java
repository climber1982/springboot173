package com.lovo.springboot.dao;

import com.lovo.springboot.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserDao extends CrudRepository<UserEntity,String> {
   @Query("from UserEntity")
    public List<UserEntity> getListUser();
}
