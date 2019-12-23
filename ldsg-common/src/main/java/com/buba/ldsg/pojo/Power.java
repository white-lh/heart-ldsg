package com.buba.ldsg.pojo;

public class Power {
    private Integer power_id;
    private String power_name;
    private String power_url;

    public Power() {
    }

    public Power(Integer power_id, String power_name, String power_url) {
        this.power_id = power_id;
        this.power_name = power_name;
        this.power_url = power_url;
    }

    public Integer getPower_id() {
        return power_id;
    }

    public void setPower_id(Integer power_id) {
        this.power_id = power_id;
    }

    public String getPower_name() {
        return power_name;
    }

    public void setPower_name(String power_name) {
        this.power_name = power_name;
    }

    public String getPower_url() {
        return power_url;
    }

    public void setPower_url(String power_url) {
        this.power_url = power_url;
    }

    @Override
    public String toString() {
        return "Power{" +
                "power_id=" + power_id +
                ", power_name='" + power_name + '\'' +
                ", power_url='" + power_url + '\'' +
                '}';
    }
}
