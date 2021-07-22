package com.qymlxin.controller;

import com.qymlxin.pojo.Book;
import com.qymlxin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        System.out.println("addBook=>"+book);
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model) {
        Book book = bookService.queryBookById(id);
        model.addAttribute("qbook", book);

        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Book book) {
        bookService.updateBook(book);

        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model) {
        List<Book> list = bookService.queryBookByName(queryBookName);
        model.addAttribute("list", list);
        return "allBook";
    }

}
