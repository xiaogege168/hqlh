package com.limao;

import com.limao.hqlh.entity.SkCourse;

public interface SkCourseMapper {
    int deleteByPrimaryKey(Integer courseID);

    int insert(SkCourse record);

    int insertSelective(SkCourse record);

    SkCourse selectByPrimaryKey(Integer courseID);

    int updateByPrimaryKeySelective(SkCourse record);

    int updateByPrimaryKey(SkCourse record);
}