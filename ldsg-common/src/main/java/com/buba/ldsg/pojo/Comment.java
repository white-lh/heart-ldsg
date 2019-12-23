package com.buba.ldsg.pojo;

public class Comment {
    private Integer c_id;
    private String c_content;
    private User user;
    private Product product;

    public Comment() {
    }

    public Comment(Integer c_id, String c_content, User user, Product product) {
        this.c_id = c_id;
        this.c_content = c_content;
        this.user = user;
        this.product = product;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
