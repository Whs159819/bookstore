package com.qf.entity;

public class Book {
    private Integer id;
    private String bookname;
    private String author;
    private double price;
    private Integer classid;
    private String descr;
    private String path;
    private Class aClass;

    public Book() {
    }

    public Book(String bookname, String author, double price, Integer classid, String descr, String path) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.classid = classid;
        this.descr = descr;
        this.path = path;
    }

    public Book(Integer id, String bookname, String author, double price, Integer classid, String descr, String path, Class aClass) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.classid = classid;
        this.descr = descr;
        this.path = path;
        this.aClass = aClass;
    }

    public Book(String bookname, String author, double price, Integer classid, String descr, String path, Class aClass) {
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.classid = classid;
        this.descr = descr;
        this.path = path;
        this.aClass = aClass;
    }

    public Book(Integer id, String bookname, String author, double price, Integer classid, String descr, String path) {
        this.id = id;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
        this.classid = classid;
        this.descr = descr;
        this.path = path;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", classid=" + classid +
                ", descr='" + descr + '\'' +
                ", path='" + path + '\'' +
                ", aClass=" + aClass +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
