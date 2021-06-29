package com.student.graduationproject.controller;


import com.student.graduationproject.model.number8data.Number8data;
import com.student.graduationproject.service.Number7dataService;
import com.student.graduationproject.service.Number8dataService;
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
public class Number8dataController {

    @Resource
    Number8dataService number8dataService;

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numbereight", method = RequestMethod.GET)
//通过拦截返回查询的所有队伍名称
    public List numbereightdata(HttpServletRequest request) {
//        List<User> result= number4dataService.select();
        List result=number8dataService.selectname();
        System.out.println(result);
        return result;
    }

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/numbereightall", method = RequestMethod.GET)

    public List numbereightalldata(HttpServletRequest request) {
//通过队伍名字查询出所有信息
        String teamAbbreviation = request.getParameter("teamAbbreviation");

        Number8data number8data = new Number8data();
        number8data.setTeamAbbreviation(teamAbbreviation);

        List result=number8dataService.selectAll(number8data);
        System.out.println(result);
        return result;
    }
}
