package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.hqlh.entity.SkShop;
import com.limao.SkShopMapper;
import com.limao.hqlh.service.SkShopService;

import java.util.List;

@Service
public class SkShopServiceImpl implements SkShopService {

    @Resource
    private SkShopMapper skShopMapper;

    @Override
    public int deleteByPrimaryKey(Integer shopid) {
        return skShopMapper.deleteByPrimaryKey(shopid);
    }

    @Override
    public int insert(SkShop record) {
        return skShopMapper.insert(record);
    }

    @Override
    public int insertSelective(SkShop record) {
        return skShopMapper.insertSelective(record);
    }

    @Override
    public SkShop selectByPrimaryKey(Integer shopid) {
        return skShopMapper.selectByPrimaryKey(shopid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkShop record) {
        return skShopMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkShop record) {
        return skShopMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkShop> findAll() {
        return skShopMapper.findAll();
    }

}


