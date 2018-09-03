package com.lwz.ssm.service;

import com.lwz.ssm.dao.UserMapper;
import com.lwz.ssm.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserEntity getUser(){
        return userMapper.getUserLimitOne();
    }
}
