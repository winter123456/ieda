package com.diechuang.demo.mapper;

import com.diechuang.demo.entiy.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
 List<User> llaUSer();
}
