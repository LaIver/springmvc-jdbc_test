package com.allen.service;

import com.allen.dao.UserDao;
import org.springframework.stereotype.Service;

/**
 * Created by Allen on 2016/6/15.
 */

public class UserService {
    private UserDao userDao;


    //处理登陆
    public int hasMatchCount(String name, String password) {
        return userDao.hasMatchCount(name, password);
    }


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
