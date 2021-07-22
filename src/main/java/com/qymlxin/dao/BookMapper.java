package com.qymlxin.dao;

import com.qymlxin.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Book book);

    //删除一本书（根据bookID）
    int deleteBookById(@Param("bookID") int id);

    //更新一本书
    int updateBook(Book book);

    //查询一本书（根据bookID）
    Book queryBookById(@Param("bookID") int id);

    //查询所有书
    List<Book> queryAllBook();

    List<Book> queryBookByName(@Param("bookName") String bookName);
}
