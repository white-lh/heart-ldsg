package com.buba.ldsg.pojo;

public class Order {
    private Integer o_id;
    private Integer o_status;
    private Product product;
    private User user;

    public Order() {
    }

    public Order(Integer o_id, Integer o_status, Product product, User user) {
        this.o_id = o_id;
        this.o_status = o_status;
        this.product = product;
        this.user = user;
    }

    public Integer getO_id() {
        return o_id;
    }

    public void setO_id(Integer o_id) {
        this.o_id = o_id;
    }

    public Integer getO_status() {
        return o_status;
    }

    public void setO_status(Integer o_status) {
        this.o_status = o_status;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
