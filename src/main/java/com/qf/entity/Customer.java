package com.qf.entity;

public class Customer {

    private Integer id;
    private String NAME;
    private String pwd;
    private String phone;
    private String email;
    private String address;

    public Customer(String NAME, String pwd, String phone, String email, String address) {
        this.NAME = NAME;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
    }

    public Customer(Integer id, String NAME, String pwd, String phone, String email, String address) {
        this.id = id;
        this.NAME = NAME;
        this.pwd = pwd;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
}
