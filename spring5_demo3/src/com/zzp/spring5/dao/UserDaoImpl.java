package com.zzp.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1") // 默认类名称 首字母小写
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("...UserDao.add()...");
    }
}
