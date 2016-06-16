package com.allen.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

/**
 * Created by Allen on 2016/6/15.
 */
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //登陆
    public int hasMatchCount(String name, String password) {
        String strsql = "select count(*) from user where user_name = ? and user_password = ?";
        int count = 0;
        count= jdbcTemplate.queryForInt(strsql, new Object[]{name, password});
        return count;
    }

    //注册
}
