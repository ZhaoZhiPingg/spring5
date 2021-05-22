package com.zzp.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zzp.spring5.entity.Book;

import java.util.Arrays;
import java.util.List;


@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 添加的方法
    @Override
    public void add(Book book) {
        // 1 创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        // 2 调用方法实现
        Object[] args = {book.getUserid(),book.getUsername(),book.getUserstatus()};
        int update =  jdbcTemplate.update(sql,args);
        System.out.println("影响的行数："+update);
    }

    // 修改
    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set username=?,userstatus=? where userid=?";
        Object[] args = {book.getUsername(),book.getUserstatus(),book.getUserid()};
        int update =  jdbcTemplate.update(sql,args);
        System.out.println("修改的行数："+update);
    }

    // 删除
    @Override
    public void deleteBook(String id) {
        String sql = "delete from  t_book where userid=? ";
        int update =  jdbcTemplate.update(sql,id);
        System.out.println("删除的行数："+update);

    }

    // 查询表记录数
    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    // 查询返回对象
    @Override
    public Book findBookInfoById(String id) {
        String sql = "select * from t_book where userid=? ";

        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    // 查询返回集合
    @Override
    public List<Book> findAllBook() {
        String sql = "select * from t_book ";
        // 调用方法
        List<Book> bookList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return bookList;
    }

    // 批量添加
    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values (?,?,?) ";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println("批量添加："+ Arrays.toString(ints));
    }

    // 批量修改
    @Override
    public void batchUpate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,userstatus=? where userid=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println("批量修改："+ Arrays.toString(ints));
    }

    // 批量删除
    @Override
    public void batchDelete(List<Object[]> batchArgs) {
        String sql = "delete from  t_book where userid=? ";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println("批量删除："+ Arrays.toString(ints));
    }

}
