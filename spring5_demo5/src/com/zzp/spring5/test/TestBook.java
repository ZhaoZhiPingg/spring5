package com.zzp.spring5.test;

import com.zzp.spring5.entity.Book;
import com.zzp.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] arg1 = {"3"};
        Object[] arg2 = {"4"};
        batchArgs.add(arg1);
        batchArgs.add(arg2);
        bookService.batchDelete(batchArgs);

    }
}
