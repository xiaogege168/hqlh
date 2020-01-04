package com.limao;

import com.limao.hqlh.entity.SkUser;

public interface SkUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(SkUser record);

    int insertSelective(SkUser record);

    SkUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(SkUser record);

    int updateByPrimaryKey(SkUser record);
}