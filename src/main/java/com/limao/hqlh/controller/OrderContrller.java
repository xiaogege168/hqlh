package com.limao.hqlh.controller;

import com.limao.hqlh.service.SkShopServiceImpl;
import com.limao.hqlh.service.SkStuOrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Controller
@RequestMapping("order")
public class OrderContrller {
    @Autowired
    SkStuOrderServiceImpl skStuOrderService;


    @ResponseBody
    @RequestMapping("getWeekDay")
    public String getWeekDay() {
Calendar calendar=Calendar.getInstance();




        int wwe=calendar.getWeekYear();
        // 获取年
        int year = calendar.get(Calendar.YEAR);

        // 获取月，这里需要需要月份的范围为0~11，因此获取月份的时候需要+1才是当前月份值
        int month = calendar.get(Calendar.MONTH) + 1;

        // 获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // 获取时
        int hour = calendar.get(Calendar.HOUR);
        // int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24小时表示

        // 获取分
        int minute = calendar.get(Calendar.MINUTE);

        // 获取秒
        int second = calendar.get(Calendar.SECOND);

        // 星期，英语国家星期从星期日开始计算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);


        int a=7*20;

        calendar.get(Calendar.DAY_OF_YEAR);
//        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("YYYY-w e");
//
//        System.out.println( LocalDate.parse("2020-5 "+1,formatter));

        String s= "现在是" + year + "年" + month + "月" + day + "日" + hour +
                "时" + minute + "分" + second + "秒" + "星期" + weekday;
        return s;
    }
    @RequestMapping("findAll")
    public ModelAndView findAll() {
        ModelAndView mv = new ModelAndView("shopList");
        mv.getModel().put("stuList", skStuOrderService.findAll());
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
