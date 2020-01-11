package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkStuOrder;

import java.util.List;

public interface SkStuOrderService {


    int deleteByPrimaryKey(Integer orderid);

    int insert(SkStuOrder record);

    int insertSelective(SkStuOrder record);

    SkStuOrder selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(SkStuOrder record);

    int updateByPrimaryKey(SkStuOrder record);

    List< SkStuOrder> findAll();

}


