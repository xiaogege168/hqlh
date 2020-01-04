package com.limao.hqlh.entity;
import java.util.*;
public class SkCourse {
    private Integer courseID;

    private String courseTime;

    private Integer coursePrice;

    private String courseContent;
    //--
    private List<SkStudent> skStudent;

    public List<SkStudent> getSkStudent() {
        return skStudent;
    }

    public void setSkStudent(List<SkStudent> skStudent) {
        this.skStudent = skStudent;
    }

    public Integer getCourseID() {
        return courseID;
    }

    public void setCourseID(Integer courseID) {
        this.courseID = courseID;
    }

    public String getCourseTime() {
        return courseTime;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public Integer getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Integer coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent;
    }
}