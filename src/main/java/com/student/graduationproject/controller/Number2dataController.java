package com.student.graduationproject.controller;

import com.student.graduationproject.service.Number2dataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

//拦截url的地址
@Controller
//@RequestMapping("/user")用来指定处理请求 路径
@RequestMapping("/lvsanlang/number")

public class Number2dataController {
    @Resource
    Number2dataService number2dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numbertwo", method = RequestMethod.GET)

    public List numbertwodata(HttpServletRequest request) {
//教育信息的返回
        List<Map> result=number2dataService.select();
        return result;
    }
}
