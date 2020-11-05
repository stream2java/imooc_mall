package com.imooc.mall.controller.service.Impl;

import com.imooc.mall.controller.service.UserService;
import com.imooc.mall.model.dao.UserMapper;
import com.imooc.mall.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService實現類
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }
}
