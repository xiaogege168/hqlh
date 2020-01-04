package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkRecords;

public interface SkRecordsService {


    int deleteByPrimaryKey(Integer recordsid);

    int insert(SkRecords record);

    int insertSelective(SkRecords record);

    SkRecords selectByPrimaryKey(Integer recordsid);

    int updateByPrimaryKeySelective(SkRecords record);

    int updateByPrimaryKey(SkRecords record);

}


