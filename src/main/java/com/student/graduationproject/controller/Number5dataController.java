package com.student.graduationproject.controller;


import com.student.graduationproject.service.Number4dataService;
import com.student.graduationproject.service.Number5dataService;
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
public class Number5dataController {

    @Resource
    Number5dataService number5dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numberfive", method = RequestMethod.GET)

    public List numberfivedata(HttpServletRequest request) {
//BMI和平均得分
        List result=number5dataService.select();
        System.out.println(result);
        return result;
    }
}
