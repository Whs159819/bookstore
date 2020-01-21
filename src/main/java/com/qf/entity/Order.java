package com.qf.entity;

public class Order {

    private  Integer id;
    private  Integer cid;
    private  Integer bid;
    private  Integer num;
    private  Integer price;
    private String status;

    public Order() {
    }

    public Order(Integer id, Integer cid, Integer bid, Integer num, Integer price, String status) {
        this.id = id;
        this.cid = cid;
        this.bid = bid;
        this.num = num;
        this.price = price;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cid=" + cid +
                ", bid=" + bid +
                ", num=" + num +
                ", price=" + price +
                ", status='" + status + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
