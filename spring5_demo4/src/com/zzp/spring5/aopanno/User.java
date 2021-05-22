package com.zzp.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

// 被增强的类
@Component
public class User {
    public void add(){
        int i = 10/0;
        System.out.println("add.....");
    }
}
