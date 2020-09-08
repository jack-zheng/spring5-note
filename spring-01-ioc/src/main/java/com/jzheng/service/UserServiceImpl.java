package com.jzheng.service;

import com.jzheng.dao.UserDao;
import com.jzheng.dao.UserDaoImpl;
import com.jzheng.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
//    private UserDao userDao = new UserDaoImpl();
    // 每次对 Dao 的扩展都需要修改 service 实现的
//    private UserDao userDao = new UserDaoMysqlImpl();

    private UserDao userDao;

    // 利用 set 动态修改 dao 实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
