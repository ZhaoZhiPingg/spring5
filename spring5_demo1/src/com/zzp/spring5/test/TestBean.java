package com.zzp.spring5.test;

import com.zzp.spring5.Book;
import com.zzp.spring5.Orders;
import com.zzp.spring5.User;
import com.zzp.spring5.bean.Emp;
import com.zzp.spring5.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean2(){
        // 1、加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取配置创建的对象
        UserService user = context.getBean("userService", UserService.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBean3(){
        // 1、加载spring配置文件
        BeanFactory context = new ClassPathXmlApplicationContext("bean4.xml");

        // 2、获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
        emp.add();
    }


}
