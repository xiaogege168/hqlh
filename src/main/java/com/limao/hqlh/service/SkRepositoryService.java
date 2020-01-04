package com.limao.hqlh.service;

import com.limao.hqlh.entity.SkRepository;

public interface SkRepositoryService {


    int deleteByPrimaryKey(Integer repositoryid);

    int insert(SkRepository record);

    int insertSelective(SkRepository record);

    SkRepository selectByPrimaryKey(Integer repositoryid);

    int updateByPrimaryKeySelective(SkRepository record);

    int updateByPrimaryKey(SkRepository record);

}


