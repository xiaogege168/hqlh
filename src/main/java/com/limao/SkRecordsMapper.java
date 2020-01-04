package com.limao;

import com.limao.hqlh.entity.SkRecords;

public interface SkRecordsMapper {
    int deleteByPrimaryKey(Integer recordsId);

    int insert(SkRecords record);

    int insertSelective(SkRecords record);

    SkRecords selectByPrimaryKey(Integer recordsId);

    int updateByPrimaryKeySelective(SkRecords record);

    int updateByPrimaryKey(SkRecords record);
}