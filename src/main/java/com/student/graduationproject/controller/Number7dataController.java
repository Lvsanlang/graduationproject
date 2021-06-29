package com.student.graduationproject.controller;


import com.student.graduationproject.service.Number6dataService;
import com.student.graduationproject.service.Number7dataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
//@RequestMapping("/user")用来指定处理请求 路径
@RequestMapping("/lvsanlang/number")
public class Number7dataController {

    @Resource
    Number7dataService number7dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numberseven", method = RequestMethod.GET)

    public List numbersevendata(HttpServletRequest request) {

//        BMI和投篮命中率
        List result=number7dataService.select();
        System.out.println(result);
        return result;
    }
}
