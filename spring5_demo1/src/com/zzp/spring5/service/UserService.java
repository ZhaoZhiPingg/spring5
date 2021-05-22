package com.zzp.spring5.service;

import com.zzp.spring5.dao.UserDao;

public class UserService {

    // 创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("...UserService.add().....");
        userDao.update();
    }
}
