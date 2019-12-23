package com.buba.ldsg.pojo;

public class Areas {
    private Integer areaid;
    private String area;
    private Cities cities;

    public Areas() {
    }

    public Areas(Integer areaid, String area, Cities cities) {
        this.areaid = areaid;
        this.area = area;
        this.cities = cities;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Cities getCities() {
        return cities;
    }

    public void setCities(Cities cities) {
        this.cities = cities;
    }
}
