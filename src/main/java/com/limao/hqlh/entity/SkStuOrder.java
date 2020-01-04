package com.limao.hqlh.entity;

public class SkStuOrder {
    private Integer orderId;

    private Integer stuId;

    private String orderTime;

    private String teachComment;

    private String ampm;

    private String today;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getTeachComment() {
        return teachComment;
    }

    public void setTeachComment(String teachComment) {
        this.teachComment = teachComment;
    }

    public String getAmpm() {
        return ampm;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }
}