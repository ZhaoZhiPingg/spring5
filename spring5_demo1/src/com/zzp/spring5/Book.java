package com.zzp.spring5;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 演示使用 set方法进行注入属性
 */
public class Book {
    // 创建属性
    private String bname = "易筋经";
    private String bauthor;
    private String address;

    // 创建属性对应的 set方法
    public void setBname(String bname){
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname + "::" +bauthor + "::" + address );
    }

}
