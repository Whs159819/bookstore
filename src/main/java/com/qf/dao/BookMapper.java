package com.qf.dao;

import com.qf.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper {

    public List<Book> findAllBook();

    public int updateBookById(Book book);

    public int delBook(Integer id);

    public int addBook(Book book);

    public Book selBookById(Integer id);
}
