package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkStudent;

import java.util.List;

public interface SkStudentService {


    int deleteByPrimaryKey(Integer stuId);

    int insert(SkStudent record);

    int insertSelective(SkStudent record);

    SkStudent selectByPrimaryKey(Integer stuId);

    List<SkStudent> findAll();

    int updateByPrimaryKeySelective(SkStudent record);

    int updateByPrimaryKey(SkStudent record);

}


