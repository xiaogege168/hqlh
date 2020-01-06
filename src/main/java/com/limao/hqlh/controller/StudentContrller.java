package com.limao.hqlh.controller;

import com.limao.hqlh.entity.SkStudent;
import com.limao.hqlh.service.SkStudentService;
import com.limao.hqlh.service.SkStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("stu")
public class StudentContrller {
     @Autowired
     SkStudentServiceImpl skStudentService;
     @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView mv=new ModelAndView("stuList");
        mv.getModel().put("stuList",skStudentService.findAll());
        return mv;
    }
     @RequestMapping("findOne")
    public ModelAndView selectByPrimaryKey(@RequestParam String a){
        ModelAndView mv=new ModelAndView("stuListA");
        mv.getModel().put("stuList",skStudentService.selectByPrimaryKey(Integer.parseInt(a)));
        return mv;
    }

     @RequestMapping("toAdd")
    public String toAdd( ){

         return "student/toAdd";

    }
     @RequestMapping("add")
    public ModelAndView stuAdd(SkStudent skStudent){
         skStudent.setCreateTime
                 (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
         ModelAndView mv=new ModelAndView("addSuccess");

         skStudentService.insertSelective(skStudent);

         return findAll();

    }
//     @RequestMapping(value = "add" )
//    public ModelAndView add(SkStudent skStudent){
//        ModelAndView mv=new ModelAndView("stuList");
//        skStudentService.insertSelective(skStudent);
//         mv.getModel().put("stuList",skStudentService.findAll());
//        return mv;
//    }

}
