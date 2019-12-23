package com.buba.ldsg.pojo;

public class ProductDetailed {
    private Integer di_id;
    private String di_band;
    private String di_name;
    private Integer di_number;
    private Double di_weight;
    private String di_place;
    private String di_hottimes;
    private String di_type;
    private Product product;

    public ProductDetailed() {
    }

    public ProductDetailed(Integer di_id, String di_band, String di_name, Integer di_number,
                           Double di_weight, String di_place, String di_hottimes, String di_type,
                           Product product) {
        this.di_id = di_id;
        this.di_band = di_band;
        this.di_name = di_name;
        this.di_number = di_number;
        this.di_weight = di_weight;
        this.di_place = di_place;
        this.di_hottimes = di_hottimes;
        this.di_type = di_type;
        this.product = product;
    }

    public Integer getDi_id() {
        return di_id;
    }

    public void setDi_id(Integer di_id) {
        this.di_id = di_id;
    }

    public String getDi_band() {
        return di_band;
    }

    public void setDi_band(String di_band) {
        this.di_band = di_band;
    }

    public String getDi_name() {
        return di_name;
    }

    public void setDi_name(String di_name) {
        this.di_name = di_name;
    }

    public Integer getDi_number() {
        return di_number;
    }

    public void setDi_number(Integer di_number) {
        this.di_number = di_number;
    }

    public Double getDi_weight() {
        return di_weight;
    }

    public void setDi_weight(Double di_weight) {
        this.di_weight = di_weight;
    }

    public String getDi_place() {
        return di_place;
    }

    public void setDi_place(String di_place) {
        this.di_place = di_place;
    }

    public String getDi_hottimes() {
        return di_hottimes;
    }

    public void setDi_hottimes(String di_hottimes) {
        this.di_hottimes = di_hottimes;
    }

    public String getDi_type() {
        return di_type;
    }

    public void setDi_type(String di_type) {
        this.di_type = di_type;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
