package com.limao.hqlh.entity;

import java.util.List;

public class SkShop {
    private Integer shopId;

    private String address;

    private Integer leaderId;

    private Integer monthIncome;

    public List<SkStudent> getStudents() {
        return students;
    }

    public void setStudents(List<SkStudent> students) {
        this.students = students;
    }

    private List<SkStudent> students;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getLeaderId() {
        return leaderId;
    }

    public void setLeaderId(Integer leaderId) {
        this.leaderId = leaderId;
    }

    public Integer getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(Integer monthIncome) {
        this.monthIncome = monthIncome;
    }
}