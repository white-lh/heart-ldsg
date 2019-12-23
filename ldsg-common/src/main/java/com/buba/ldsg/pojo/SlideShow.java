package com.buba.ldsg.pojo;

public class SlideShow {
    private Integer ss_id;
    private String ss_name;
    private String ss_url;

    public SlideShow() {
    }

    public SlideShow(Integer ss_id, String ss_name, String ss_url) {
        this.ss_id = ss_id;
        this.ss_name = ss_name;
        this.ss_url = ss_url;
    }

    public Integer getSs_id() {
        return ss_id;
    }

    public void setSs_id(Integer ss_id) {
        this.ss_id = ss_id;
    }

    public String getSs_name() {
        return ss_name;
    }

    public void setSs_name(String ss_name) {
        this.ss_name = ss_name;
    }

    public String getSs_url() {
        return ss_url;
    }

    public void setSs_url(String ss_url) {
        this.ss_url = ss_url;
    }

    @Override
    public String toString() {
        return "SlideShow{" +
                "ss_id=" + ss_id +
                ", ss_name='" + ss_name + '\'' +
                ", ss_url='" + ss_url + '\'' +
                '}';
    }
}
