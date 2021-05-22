package com.zzp.spring5.dao;

import com.zzp.spring5.entity.Book;

import java.util.List;

public interface BookDao {
    // 添加的方法
    void add(Book book);
    // 修改
    void updateBook(Book book);
    // 删除
    void deleteBook(String id);

    // 查询表记录数
    int selectCount();

    // 查询返回对象
    Book findBookInfoById(String id);

    // 查询返回集合
    List<Book> findAllBook();
    // 批量添加
    void batchAdd(List<Object[]> batchArgs);
    // 批量修改
    void batchUpate(List<Object[]> batchArgs);
    // 批量删除
    void batchDelete(List<Object[]> batchArgs);
}
