package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.SkRecordsMapper;
import com.limao.hqlh.entity.SkRecords;
import com.limao.hqlh.service.SkRecordsService;

@Service
public class SkRecordsServiceImpl implements SkRecordsService {

    @Resource
    private SkRecordsMapper skRecordsMapper;

    @Override
    public int deleteByPrimaryKey(Integer recordsid) {
        return skRecordsMapper.deleteByPrimaryKey(recordsid);
    }

    @Override
    public int insert(SkRecords record) {
        return skRecordsMapper.insert(record);
    }

    @Override
    public int insertSelective(SkRecords record) {
        return skRecordsMapper.insertSelective(record);
    }

    @Override
    public SkRecords selectByPrimaryKey(Integer recordsid) {
        return skRecordsMapper.selectByPrimaryKey(recordsid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkRecords record) {
        return skRecordsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkRecords record) {
        return skRecordsMapper.updateByPrimaryKey(record);
    }

}


