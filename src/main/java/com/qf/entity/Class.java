package com.qf.entity;

public class Class {
    private Integer id;
    private String NAME;
    private String descr;

    public Class() {
    }

    public Class(Integer id, String NAME, String descr) {
        this.id = id;
        this.NAME = NAME;
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", descr='" + descr + '\'' +
                '}';
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

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
