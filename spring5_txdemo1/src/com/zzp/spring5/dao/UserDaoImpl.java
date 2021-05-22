package com.zzp.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 小明 转账 100 给 小王
    //少钱
    @Override
    public void reduceMoeny() {
        String sql = "update t_account set money= money-? where username=?";
        jdbcTemplate.update(sql,100,"小明");
    }

    //多钱
    @Override
    public void addMoney() {
        String sql = "update t_account set money= money+? where username=?";
        jdbcTemplate.update(sql,100,"小王");
    }
}
