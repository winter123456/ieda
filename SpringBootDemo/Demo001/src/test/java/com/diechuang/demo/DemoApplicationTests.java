package com.diechuang.demo;

import com.diechuang.demo.entiy.User;
import com.diechuang.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
   private UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.llaUSer();
        for (User user : users) {
            System.out.println(user);
        }
    }
    void test(){

    }


}
