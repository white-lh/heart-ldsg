package com.buba.ldsg.pojo;

public class Product {
    private Integer p_id;
    private String p_name;
    private String p_picture;
    private Integer p_count;
    private Double p_price;
    private String p_characteristic;
    private String p_factory;
    private String p_discount;
    private String p_types;
    private Integer p_status;

    public Product() {
    }

    public Product(Integer p_id, String p_name, String p_picture, Integer p_count, Double p_price
            , String p_characteristic, String p_factory, String p_discount, String p_types,
                   Integer p_status) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_picture = p_picture;
        this.p_count = p_count;
        this.p_price = p_price;
        this.p_characteristic = p_characteristic;
        this.p_factory = p_factory;
        this.p_discount = p_discount;
        this.p_types = p_types;
        this.p_status = p_status;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_picture() {
        return p_picture;
    }

    public void setP_picture(String p_picture) {
        this.p_picture = p_picture;
    }

    public Integer getP_count() {
        return p_count;
    }

    public void setP_count(Integer p_count) {
        this.p_count = p_count;
    }

    public Double getP_price() {
        return p_price;
    }

    public void setP_price(Double p_price) {
        this.p_price = p_price;
    }

    public String getP_characteristic() {
        return p_characteristic;
    }

    public void setP_characteristic(String p_characteristic) {
        this.p_characteristic = p_characteristic;
    }

    public String getP_factory() {
        return p_factory;
    }

    public void setP_factory(String p_factory) {
        this.p_factory = p_factory;
    }

    public String getP_discount() {
        return p_discount;
    }

    public void setP_discount(String p_discount) {
        this.p_discount = p_discount;
    }

    public String getP_types() {
        return p_types;
    }

    public void setP_types(String p_types) {
        this.p_types = p_types;
    }

    public int getP_status() {
        return p_status;
    }

    public void setP_status(Integer p_status) {
        this.p_status = p_status;
    }
}
