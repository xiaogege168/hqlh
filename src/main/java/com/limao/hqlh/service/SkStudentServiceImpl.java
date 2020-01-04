package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.SkStudentMapper;
import com.limao.hqlh.entity.SkStudent;
import com.limao.hqlh.service.SkStudentService;

import java.util.List;

@Service
public class SkStudentServiceImpl implements SkStudentService {

    @Resource
    private SkStudentMapper skStudentMapper;

    @Override
    public int deleteByPrimaryKey(Integer stuId) {
        return skStudentMapper.deleteByPrimaryKey(stuId);
    }

    @Override
    public int insert(SkStudent record) {
        return skStudentMapper.insert(record);
    }

    @Override
    public int insertSelective(SkStudent record) {
        return skStudentMapper.insertSelective(record);
    }

    @Override
    public SkStudent selectByPrimaryKey(Integer stuId) {
        return skStudentMapper.selectByPrimaryKey(stuId);
    }

    @Override
    public List<SkStudent> findAll() {
        return skStudentMapper.findAll();
    }

    @Override
    public int updateByPrimaryKeySelective(SkStudent record) {
        return skStudentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkStudent record) {
        return skStudentMapper.updateByPrimaryKey(record);
    }

}


