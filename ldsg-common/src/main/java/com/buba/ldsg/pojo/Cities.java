package com.buba.ldsg.pojo;

public class Cities {
    private Integer cityid;
    private String city;
    private Provinces provinces;

    public Cities() {
    }

    public Cities(Integer cityid, String city, Provinces provinces) {
        this.cityid = cityid;
        this.city = city;
        this.provinces = provinces;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Provinces getProvinces() {
        return provinces;
    }

    public void setProvinces(Provinces provinces) {
        this.provinces = provinces;
    }
}
