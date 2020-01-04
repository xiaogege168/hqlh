package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkUser;

public interface SkUserService {


    int deleteByPrimaryKey(Integer userid);

    int insert(SkUser record);

    int insertSelective(SkUser record);

    SkUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(SkUser record);

    int updateByPrimaryKey(SkUser record);

}


