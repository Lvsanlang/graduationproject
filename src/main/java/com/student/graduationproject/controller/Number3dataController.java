package com.student.graduationproject.controller;


import com.student.graduationproject.service.Number2dataService;
import com.student.graduationproject.service.Number3dataService;
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

public class Number3dataController {

    @Resource
    Number3dataService number3dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numberthree", method = RequestMethod.GET)

    public List numberthreedata(HttpServletRequest request) {
//        年龄和上场次数
        List<Map> result=number3dataService.select();
        return result;
    }
}
