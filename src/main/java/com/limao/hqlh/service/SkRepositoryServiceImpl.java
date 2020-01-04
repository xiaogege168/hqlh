package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.hqlh.entity.SkRepository;
import com.limao.SkRepositoryMapper;
import com.limao.hqlh.service.SkRepositoryService;

@Service
public class SkRepositoryServiceImpl implements SkRepositoryService {

    @Resource
    private SkRepositoryMapper skRepositoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer repositoryid) {
        return skRepositoryMapper.deleteByPrimaryKey(repositoryid);
    }

    @Override
    public int insert(SkRepository record) {
        return skRepositoryMapper.insert(record);
    }

    @Override
    public int insertSelective(SkRepository record) {
        return skRepositoryMapper.insertSelective(record);
    }

    @Override
    public SkRepository selectByPrimaryKey(Integer repositoryid) {
        return skRepositoryMapper.selectByPrimaryKey(repositoryid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkRepository record) {
        return skRepositoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkRepository record) {
        return skRepositoryMapper.updateByPrimaryKey(record);
    }

}


