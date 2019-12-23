package com.buba.ldsg.pojo;

public class RolePower {
    private Role role;
    private Power power;

    public RolePower() {
    }

    public RolePower(Role role, Power power) {
        this.role = role;
        this.power = power;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }
}
