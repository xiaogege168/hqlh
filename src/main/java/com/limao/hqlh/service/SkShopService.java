package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkShop;

import java.util.List;

public interface SkShopService {


    int deleteByPrimaryKey(Integer shopid);

    int insert(SkShop record);

    int insertSelective(SkShop record);

    SkShop selectByPrimaryKey(Integer shopid);

    int updateByPrimaryKeySelective(SkShop record);

    int updateByPrimaryKey(SkShop record);

    List<SkShop> findAll();

}


