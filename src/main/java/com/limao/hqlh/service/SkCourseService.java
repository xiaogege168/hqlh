package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkCourse;

public interface SkCourseService {


    int deleteByPrimaryKey(Integer courseid);

    int insert(SkCourse record);

    int insertSelective(SkCourse record);

    SkCourse selectByPrimaryKey(Integer courseid);

    int updateByPrimaryKeySelective(SkCourse record);

    int updateByPrimaryKey(SkCourse record);

}


