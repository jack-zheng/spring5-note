package com.jzheng.mapper;

import com.jzheng.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUser();

    int addUser(User user);

    int deleteUser(int id);
}
