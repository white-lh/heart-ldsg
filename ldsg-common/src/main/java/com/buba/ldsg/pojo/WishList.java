package com.buba.ldsg.pojo;

public class WishList {
    private Integer ws_id;
    private String ws_img;
    private String ws_name;
    private Double ws_price;
    private Integer ws_num;
    private Integer ws_ls;
    private User user;
    private Product product;

    public WishList() {
    }

    public WishList(Integer ws_id, String ws_img, String ws_name, Double ws_price, Integer ws_num
            , Integer ws_ls, User user, Product product) {
        this.ws_id = ws_id;
        this.ws_img = ws_img;
        this.ws_name = ws_name;
        this.ws_price = ws_price;
        this.ws_num = ws_num;
        this.ws_ls = ws_ls;
        this.user = user;
        this.product = product;
    }

    public Integer getWs_id() {
        return ws_id;
    }

    public void setWs_id(Integer ws_id) {
        this.ws_id = ws_id;
    }

    public String getWs_img() {
        return ws_img;
    }

    public void setWs_img(String ws_img) {
        this.ws_img = ws_img;
    }

    public String getWs_name() {
        return ws_name;
    }

    public void setWs_name(String ws_name) {
        this.ws_name = ws_name;
    }

    public Double getWs_price() {
        return ws_price;
    }

    public void setWs_price(Double ws_price) {
        this.ws_price = ws_price;
    }

    public Integer getWs_num() {
        return ws_num;
    }

    public void setWs_num(Integer ws_num) {
        this.ws_num = ws_num;
    }

    public Integer getWs_ls() {
        return ws_ls;
    }

    public void setWs_ls(Integer ws_ls) {
        this.ws_ls = ws_ls;
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
