package com.qf.entity;


public class Admin {

    private Integer id;
    private String NAME;
    private String pwd;

    public Admin() {
    }

    public Admin(Integer id, String NAME, String pwd) {
        this.id = id;
        this.NAME = NAME;
        this.pwd = pwd;
    }

    public Admin(String NAME, String pwd) {
        this.NAME = NAME;
        this.pwd = pwd;
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

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
