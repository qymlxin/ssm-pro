package com.qymlxin.pojo;

public class Book {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

    //constructor
    public Book(int bookID, String bookName, int bookCounts, String detail) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookCounts = bookCounts;
        this.detail = detail;
    }
    public Book() {}

    //getter
    public int getBookID() {
        return bookID;
    }
    public String getBookName() {
        return bookName;
    }
    public int getBookCounts() {
        return bookCounts;
    }
    public String getDetail() {
        return detail;
    }

    //setter
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setBookCounts(int bookCounts) {
        this.bookCounts = bookCounts;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
}
