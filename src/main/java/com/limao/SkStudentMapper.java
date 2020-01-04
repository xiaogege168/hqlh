package com.limao;

import com.limao.hqlh.entity.SkStudent;import java.util.List;

public interface SkStudentMapper {
    int deleteByPrimaryKey(Integer stu_id);

    int insert(SkStudent record);

    int insertSelective(SkStudent record);

    SkStudent selectByPrimaryKey(Integer stu_id);

    int updateByPrimaryKeySelective(SkStudent record);

    int updateByPrimaryKey(SkStudent record);

    List<SkStudent> findAll();
}