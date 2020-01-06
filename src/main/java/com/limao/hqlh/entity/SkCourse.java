package com.limao.hqlh.entity;
import java.util.*;
public class SkCourse {
    private Integer courseId;

    private String courseTime;

    private Integer coursePrice;

    private String courseContent;
    //--
    private List<SkStudent> skStudents;

    public List<SkStudent> getSkStudents() {
        return skStudents;
    }

    public void setSkStudents(List<SkStudent> skStudents) {
        this.skStudents = skStudents;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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