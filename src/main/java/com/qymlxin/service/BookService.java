package com.qymlxin.service;

import com.qymlxin.pojo.Book;

import java.util.List;

public interface BookService {

    //增加一本书
    int addBook(Book book);

    //删除一本书（根据bookID）
    int deleteBookById(int id);

    //更新一本书
    int updateBook(Book book);

    //查询一本书（根据bookID）
    Book queryBookById(int id);

    //查询所有书
    List<Book> queryAllBook();

    List<Book> queryBookByName(String bookName);

}
