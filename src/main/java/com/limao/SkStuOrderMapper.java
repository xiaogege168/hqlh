package com.limao;

import com.limao.hqlh.entity.SkStuOrder;

import java.util.List;

public interface SkStuOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(SkStuOrder record);

    int insertSelective(SkStuOrder record);

    SkStuOrder selectByPrimaryKey(Integer orderId);

//    List<SkStuOrder> selectByToday(Integer orderId);
//
//    List<SkStuOrder>  selectByShop(Integer orderId);

    int updateByPrimaryKeySelective(SkStuOrder record);

    int updateByPrimaryKey(SkStuOrder record);
}