package com.lwz.ssm.dao;

import com.lwz.ssm.entity.UserEntity;

import javax.annotation.Resource;

public interface UserMapper {
    UserEntity getUserLimitOne();
}
