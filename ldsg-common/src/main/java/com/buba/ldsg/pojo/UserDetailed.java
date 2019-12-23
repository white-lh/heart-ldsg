package com.buba.ldsg.pojo;

public class UserDetailed {
    private Integer d_id;
    private String d_address;
    private String d_head;
    private String d_name;
    private Integer d_phone;
    private String d_email;
    private Integer d_sex;
    private User user;

    public UserDetailed() {
    }

    public UserDetailed(Integer d_id, String d_address, String d_head, String d_name,
                        Integer d_phone, String d_email, Integer d_sex, User user) {
        this.d_id = d_id;
        this.d_address = d_address;
        this.d_head = d_head;
        this.d_name = d_name;
        this.d_phone = d_phone;
        this.d_email = d_email;
        this.d_sex = d_sex;
        this.user = user;
    }

    public Integer getD_id() {
        return d_id;
    }

    public void setD_id(Integer d_id) {
        this.d_id = d_id;
    }

    public String getD_address() {
        return d_address;
    }

    public void setD_address(String d_address) {
        this.d_address = d_address;
    }

    public String getD_head() {
        return d_head;
    }

    public void setD_head(String d_head) {
        this.d_head = d_head;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public Integer getD_phone() {
        return d_phone;
    }

    public void setD_phone(Integer d_phone) {
        this.d_phone = d_phone;
    }

    public String getD_email() {
        return d_email;
    }

    public void setD_email(String d_email) {
        this.d_email = d_email;
    }

    public Integer getD_sex() {
        return d_sex;
    }

    public void setD_sex(Integer d_sex) {
        this.d_sex = d_sex;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserDetailed{" +
                "d_id=" + d_id +
                ", d_address='" + d_address + '\'' +
                ", d_head='" + d_head + '\'' +
                ", d_name='" + d_name + '\'' +
                ", d_phone=" + d_phone +
                ", d_email='" + d_email + '\'' +
                ", d_sex=" + d_sex +
                ", user=" + user +
                '}';
    }
}
