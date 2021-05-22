package com.zzp.spring5.service;

import com.zzp.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 在注解里面value属性可以省略不写，
// 默认值是类名，首字母小写 ( UserService ==> userService )
//@Component(value = "userService") // <bean id="userService" class="..." />效果一样
@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired  // 根据类型进行注入
//    @Qualifier(value = "userDaoImpl1")  // 根据名称进行注入

    //@Resource  // 根据类型进行注入
    @Resource(name = "userDaoImpl1") // 根据名称进行注入
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add(){
        System.out.println("...UserService.add()....name:" + name);
        userDao.add();
    }
}
