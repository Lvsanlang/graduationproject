package com.student.graduationproject.controller;

import com.student.graduationproject.service.Number1dataService;
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

    public class Number1dataController {
        @Resource
        Number1dataService number1dataService;

        @ResponseBody
        //处理带参数的
        @RequestMapping(value = "/numberone", method = RequestMethod.GET)
        //地图的信息值返回
        public List numberonedata(HttpServletRequest request) {
            List<Map> result=number1dataService.select();
            return result;
        }
    }

