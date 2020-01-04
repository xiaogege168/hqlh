package com.limao;

import com.limao.hqlh.entity.SkRepository;

public interface SkRepositoryMapper {
    int deleteByPrimaryKey(Integer repositoryId);

    int insert(SkRepository record);

    int insertSelective(SkRepository record);

    SkRepository selectByPrimaryKey(Integer repositoryId);

    int updateByPrimaryKeySelective(SkRepository record);

    int updateByPrimaryKey(SkRepository record);
}