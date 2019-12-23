package com.buba.ldsg.pojo;

public class ShoppingCart {
    private Integer sc_id;
    private String sc_img;
    private String sc_name;
    private Double sc_price;
    private Integer sc_quantity;
    private Integer sc_total;
    private Product product;
    private User user;

    public ShoppingCart() {
    }

    public ShoppingCart(Integer sc_id, String sc_img, String sc_name, Double sc_price,
                        Integer sc_quantity, Integer sc_total, Product product, User user) {
        this.sc_id = sc_id;
        this.sc_img = sc_img;
        this.sc_name = sc_name;
        this.sc_price = sc_price;
        this.sc_quantity = sc_quantity;
        this.sc_total = sc_total;
        this.product = product;
        this.user = user;
    }

    public Integer getSc_id() {
        return sc_id;
    }

    public void setSc_id(Integer sc_id) {
        this.sc_id = sc_id;
    }

    public String getSc_img() {
        return sc_img;
    }

    public void setSc_img(String sc_img) {
        this.sc_img = sc_img;
    }

    public String getSc_name() {
        return sc_name;
    }

    public void setSc_name(String sc_name) {
        this.sc_name = sc_name;
    }

    public Double getSc_price() {
        return sc_price;
    }

    public void setSc_price(Double sc_price) {
        this.sc_price = sc_price;
    }

    public Integer getSc_quantity() {
        return sc_quantity;
    }

    public void setSc_quantity(Integer sc_quantity) {
        this.sc_quantity = sc_quantity;
    }

    public Integer getSc_total() {
        return sc_total;
    }

    public void setSc_total(Integer sc_total) {
        this.sc_total = sc_total;
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

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "sc_id=" + sc_id +
                ", sc_img='" + sc_img + '\'' +
                ", sc_name='" + sc_name + '\'' +
                ", sc_price=" + sc_price +
                ", sc_quantity=" + sc_quantity +
                ", sc_total=" + sc_total +
                ", product=" + product +
                ", user=" + user +
                '}';
    }
}
