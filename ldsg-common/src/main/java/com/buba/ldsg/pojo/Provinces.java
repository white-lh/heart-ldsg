package com.buba.ldsg.pojo;

public class Provinces {
    private Integer provinceid;
    private String province;

    public Provinces() {
    }

    public Provinces(Integer provinceid, String province) {
        this.provinceid = provinceid;
        this.province = province;
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Provinces{" +
                "provinceid=" + provinceid +
                ", province='" + province + '\'' +
                '}';
    }
}
