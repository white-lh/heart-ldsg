package com.buba.ldsg.pojo;

import java.util.Date;

public class Coupon {
    private Integer dc_id;
    private String dc_site;
    private Double dc_value;
    private Integer dc_condition;
    private Date dc_start;
    private Date dc_over;
    private String dc_aging;
    private Integer dc_status;
    private Product product;
    private User user;

    public Coupon() {
    }

    public Coupon(Integer dc_id, String dc_site, Double dc_value, Integer dc_condition,
                  Date dc_start, Date dc_over, String dc_aging, Integer dc_status,
                  Product product, User user) {
        this.dc_id = dc_id;
        this.dc_site = dc_site;
        this.dc_value = dc_value;
        this.dc_condition = dc_condition;
        this.dc_start = dc_start;
        this.dc_over = dc_over;
        this.dc_aging = dc_aging;
        this.dc_status = dc_status;
        this.product = product;
        this.user = user;
    }

    public Integer getDc_id() {
        return dc_id;
    }

    public void setDc_id(Integer dc_id) {
        this.dc_id = dc_id;
    }

    public String getDc_site() {
        return dc_site;
    }

    public void setDc_site(String dc_site) {
        this.dc_site = dc_site;
    }

    public Double getDc_value() {
        return dc_value;
    }

    public void setDc_value(Double dc_value) {
        this.dc_value = dc_value;
    }

    public Integer getDc_condition() {
        return dc_condition;
    }

    public void setDc_condition(Integer dc_condition) {
        this.dc_condition = dc_condition;
    }

    public Date getDc_start() {
        return dc_start;
    }

    public void setDc_start(Date dc_start) {
        this.dc_start = dc_start;
    }

    public Date getDc_over() {
        return dc_over;
    }

    public void setDc_over(Date dc_over) {
        this.dc_over = dc_over;
    }

    public String getDc_aging() {
        return dc_aging;
    }

    public void setDc_aging(String dc_aging) {
        this.dc_aging = dc_aging;
    }

    public Integer getDc_status() {
        return dc_status;
    }

    public void setDc_status(Integer dc_status) {
        this.dc_status = dc_status;
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
