package com.qymlxin.service;

import com.qymlxin.dao.BookMapper;
import com.qymlxin.pojo.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }
    public Book queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }
    public List<Book> queryAllBook() {
        return bookMapper.queryAllBook();
    }
    public List<Book> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
