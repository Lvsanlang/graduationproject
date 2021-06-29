package com.student.graduationproject.controller;


import com.student.graduationproject.model.User.User;
import com.student.graduationproject.service.Number3dataService;
import com.student.graduationproject.service.Number4dataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Controller
//@RequestMapping("/user")用来指定处理请求 路径
@RequestMapping("/lvsanlang/number")
public class Number4dataController {

    @Resource
    Number4dataService number4dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numberfour", method = RequestMethod.GET)

    public List numberfourdata(HttpServletRequest request) {
//        BMI和上场次数
        List result=number4dataService.select();
        System.out.println(result);
        return result;
    }
}
