package com.limao.hqlh.entity;

public class SkStudent {
    private Integer stu_id;

    private String stuName;

    private String stuPassword;

    private String age;

    private String gender;

    private String parentNum;

    private String orderId;

    private String realPrice;

    private Integer shopId;

    private String others;

    private String createTime;

    private String courseId;
//
    private SkCourse skCourse;

    public SkCourse getSkCourse() {
        return skCourse;
    }

    public void setSkCourse(SkCourse skCourse) {
        this.skCourse = skCourse;
    }

    private SkShop skShop;



    public SkShop getSkShop() {
        return skShop;
    }

    public void setSkShop(SkShop skShop) {
        this.skShop = skShop;
    }


    public Integer getStu_id() {
        return stu_id;
    }

    public void setStu_id(Integer stu_id) {
        this.stu_id = stu_id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getParentNum() {
        return parentNum;
    }

    public void setParentNum(String parentNum) {
        this.parentNum = parentNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(String realPrice) {
        this.realPrice = realPrice;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}