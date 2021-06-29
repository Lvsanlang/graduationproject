package com.student.graduationproject.controller;


import com.student.graduationproject.service.Number5dataService;
import com.student.graduationproject.service.Number6dataService;
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
public class Number6dataController {

    @Resource
    Number6dataService number6dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numbersix", method = RequestMethod.GET)

    public List numbersixdata(HttpServletRequest request) {

        //BMI和平均篮板数
        List result=number6dataService.select();
        System.out.println(result);
        return result;
    }
}
