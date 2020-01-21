package com.qf.controller;

import com.qf.entity.Book;
import com.qf.dao.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookMapper bookMapper;

    @RequestMapping("/findAllbook")
    public String findAllBook(Model model){
        List<Book> bookList = bookMapper.findAllBook();
        model.addAttribute("bookList",bookList);
        return "behind/book_list";
    }

    @RequestMapping("/del")
    public String delBook(Model model,Integer id){
        int i = bookMapper.delBook(id);
        if(i==1){
            return "redirect:/book/findAllbook";
        }
        return null;
    }

    @RequestMapping("/toaddbook")
    public String toadd(Model model){
        Book book = new Book();
        model.addAttribute("book",book);
        return "behind/add_book";
    }

    @RequestMapping("/toupdate")
    public String selBookById(Model model,Integer id){
        Book book = bookMapper.selBookById(id);
        model.addAttribute("book",book);
        if(book!=null){
            return "behind/add_book";
        }
        return null;
    }

    @RequestMapping("/updateOrAdd")
    public String updateOrAdd(Model model,Book book){
        Integer id = book.getId();
        if(id!=null){
            bookMapper.updateBookById(book);
        }else{
           bookMapper.addBook(book);
        }
        return "redirect:/book/findAllbook";
    }

}
