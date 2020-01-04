package com.limao.hqlh.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Created by Administrator on 2016/5/6.
 */
@Controller
public class IndexController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @RequestMapping("/go")
    public ModelAndView welcome() {
        ModelAndView mv=new ModelAndView("bbb");
        mv.addObject("time", new Date());
        mv.addObject("message", this.message);
        return mv;
    }
    @RequestMapping("/come")
    public String come() {
        return "bbb";
    }
}