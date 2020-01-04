package com.limao.hqlh.controller;

import com.limao.hqlh.entity.SkStudent;
import com.limao.hqlh.service.SkShopServiceImpl;
import com.limao.hqlh.service.SkStudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("shop")
public class ShopContrller {
    @Autowired
    SkShopServiceImpl skShopService;

    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("shopList");
        mv.getModel().put("stuList", skShopService.findAll());
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
