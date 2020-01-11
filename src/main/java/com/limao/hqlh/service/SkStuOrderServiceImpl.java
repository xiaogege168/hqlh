package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.hqlh.entity.SkStuOrder;
import com.limao.SkStuOrderMapper;
import com.limao.hqlh.service.SkStuOrderService;

import java.util.List;

@Service
public class SkStuOrderServiceImpl implements SkStuOrderService {

    @Resource
    private SkStuOrderMapper skStuOrderMapper;

    @Override
    public int deleteByPrimaryKey(Integer orderid) {
        return skStuOrderMapper.deleteByPrimaryKey(orderid);
    }

    @Override
    public int insert(SkStuOrder record) {
        return skStuOrderMapper.insert(record);
    }

    @Override
    public int insertSelective(SkStuOrder record) {
        return skStuOrderMapper.insertSelective(record);
    }

    @Override
    public SkStuOrder selectByPrimaryKey(Integer orderid) {
        return skStuOrderMapper.selectByPrimaryKey(orderid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkStuOrder record) {
        return skStuOrderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkStuOrder record) {
        return skStuOrderMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SkStuOrder> findAll() {
        return skStuOrderMapper.findAll();
    }

}


