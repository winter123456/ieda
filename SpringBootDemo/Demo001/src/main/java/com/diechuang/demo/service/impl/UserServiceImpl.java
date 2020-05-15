package com.diechuang.demo.service.impl;

import com.diechuang.demo.entiy.User;
import com.diechuang.demo.mapper.UserMapper;
import com.diechuang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> llaUSer() {
        return userMapper.llaUSer();
    }
}
