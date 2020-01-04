package com.limao.hqlh.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.limao.SkCourseMapper;
import com.limao.hqlh.entity.SkCourse;
import com.limao.hqlh.service.SkCourseService;

@Service
public class SkCourseServiceImpl implements SkCourseService {

    @Resource
    private SkCourseMapper skCourseMapper;

    @Override
    public int deleteByPrimaryKey(Integer courseid) {
        return skCourseMapper.deleteByPrimaryKey(courseid);
    }

    @Override
    public int insert(SkCourse record) {
        return skCourseMapper.insert(record);
    }

    @Override
    public int insertSelective(SkCourse record) {
        return skCourseMapper.insertSelective(record);
    }

    @Override
    public SkCourse selectByPrimaryKey(Integer courseid) {
        return skCourseMapper.selectByPrimaryKey(courseid);
    }

    @Override
    public int updateByPrimaryKeySelective(SkCourse record) {
        return skCourseMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SkCourse record) {
        return skCourseMapper.updateByPrimaryKey(record);
    }

}


