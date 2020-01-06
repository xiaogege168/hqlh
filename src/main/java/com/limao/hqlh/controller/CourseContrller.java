package com.limao.hqlh.controller;

import com.limao.hqlh.entity.SkCourse;
import com.limao.hqlh.service.SkCourseServiceImpl;
import com.limao.hqlh.service.SkShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseContrller {
    @Autowired
    SkCourseServiceImpl skCourseService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("course/courseList");
        List<SkCourse> skCourses=skCourseService.findAll();
        mv.getModel().put("courseList", skCourses);
        return mv;
    }

//    @RequestMapping("findOne")
//    public ModelAndView selectByPrimaryKey(@RequestParam String a) {
//        ModelAndView mv = new ModelAndView("stuListA");
//        mv.getModel().put("stuList", skStudentService.selectByPrimaryKey(Integer.parseInt(a)));
//        return mv;
//    }
//
//    @RequestMapping("stuAdd")
//    public String stuAdd() {
//        return "stuAdd";
//    }
//
//    @RequestMapping(value = "add")
//    public ModelAndView add(SkStudent skStudent) {
//        ModelAndView mv = new ModelAndView("stuList");
//        skStudentService.insertSelective(skStudent);
//        mv.getModel().put("stuList", skStudentService.findAll());
//        return mv;
//    }

}
