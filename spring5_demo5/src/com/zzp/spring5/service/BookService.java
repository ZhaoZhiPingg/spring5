package com.zzp.spring5.service;

import com.zzp.spring5.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzp.spring5.entity.Book;

import java.util.List;

@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //删除
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    // 查询表记录数
    public int findCount(){
        return bookDao.selectCount();
    }

    // 查询返回对象
    public Book findOne(String id){
        return bookDao.findBookInfoById(id);
    }

    // 查询返回集合
    public List<Book> findAll(){
        return bookDao.findAllBook();
    }

    // 批量添加
    public void batchAdd(List<Object[]> batchArgs){
         bookDao.batchAdd(batchArgs);
    }

    // 批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpate(batchArgs);
    }

    // 批量删除
    public void batchDelete(List<Object[]> batchArgs){
        bookDao.batchDelete(batchArgs);
    }

}
