package com.diechuang.demo.service;

import com.diechuang.demo.entiy.User;
import com.diechuang.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
  /*  @Autowired
   private UserMapper userMapper;*/
   public List<User> llaUSer();

}
