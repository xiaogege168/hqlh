package com.limao;

import com.limao.hqlh.entity.SkShop;

import java.util.List;

public interface SkShopMapper {
    int deleteByPrimaryKey(Integer shopId);

    int insert(SkShop record);

    int insertSelective(SkShop record);

    SkShop selectByPrimaryKey(Integer shopId);

    int updateByPrimaryKeySelective(SkShop record);

    int updateByPrimaryKey(SkShop record);

    List<SkShop> findAll();
}