package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.SkUserMapper;
import com.limao.hqlh.entity.SkUser;
import com.limao.hqlh.service.SkUserService;

@Service
public class SkUserServiceImpl implements SkUserService {

    @Resource
    private SkUserMapper skUserMapper;

    @Override
    public int deleteByPrimaryKey(Integer userid) {
        return skUserMapper.deleteByPrimaryKey(userid);
    }

    @Override
    public int insert(SkUser record) {
        return skUserMapper.insert(record);
    }

    @Override
    public int insertSelective(SkUser record) {
        return skUserMapper.insertSelective(record);
    }

    @Override
    public SkUser selectByPrimaryKey(Integer userid) {
        return skUserMapper.selectByPrimaryKey(userid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkUser record) {
        return skUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkUser record) {
        return skUserMapper.updateByPrimaryKey(record);
    }

}


