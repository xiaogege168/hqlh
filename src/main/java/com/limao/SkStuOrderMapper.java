package com.limao;

import com.limao.hqlh.entity.SkStuOrder;

public interface SkStuOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(SkStuOrder record);

    int insertSelective(SkStuOrder record);

    SkStuOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(SkStuOrder record);

    int updateByPrimaryKey(SkStuOrder record);
}