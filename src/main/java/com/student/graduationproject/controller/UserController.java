package com.student.graduationproject.controller;

import com.student.graduationproject.model.User.User;
import com.student.graduationproject.model.User.UserExample;
import com.student.graduationproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;
//拦截url的地址
@Controller
//@RequestMapping("/user")用来指定处理请求 路径
@RequestMapping("/lvsanlang/user")
public class UserController {
    @Resource
    //相当于userService = new UserService()
    UserService userService;

    @ResponseBody
    //处理带参数的
//    ------------------------------登录------------------------------------
    @RequestMapping(value = "/index", method = RequestMethod.POST)
//    通过拦截url=/lvsanlang/user/index post请求 进行从前端获取username，password
//    存储到user中调用userService.userLogin(user)进行查询 获取到id 字段
//    如果查询到的id为null则返回无此人给前端，如果不为空则返回登陆成功，向前台穿id值
    public Map<String, Object> userIndex(HttpServletRequest request) {
        //获取前端数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        User user1 = userService.userLogin(user);


//        HttpSession session = request.getSession();

        Map<String, Object> map = new HashMap<String, Object>();

        System.out.println(user1.getId());

        if (user1.getId() != null) {
            HttpSession session = request.getSession();
            session.setAttribute("id",user1.getId());
            session.setAttribute("username",user1.getUsername());
            session.setAttribute("email",user1.getEmail());
            session.setAttribute("sex",user1.getSex());
            session.setAttribute("birthday",user1.getBirthday());

            map.put("code", "1");
            map.put("message", "用户登录成功");
            map.put("userInfo",user1.getId());
        } else {
            map.put("userInfo", user1.getId());
            map.put("code", "0");
            map.put("message", "用户登录失败");
        }
        return map;

    }
//    ---------------------------------------------------------------------
//    -----------------------------注册-------------------------------------

    //注册后台：
    //返回数据Json类型
    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    //HttpServletRequest用来接收请求的参数
//    从前台获取各字段值 先进性查询通过邮箱，手机号查询看是否存在，存在就不可以再次注册，不存在调用方法进行sql插入操作
    public Map<String, Object> userRegister(HttpServletRequest request) {
        String uid = UUID.randomUUID().toString().replace("-", "");
        int sex;
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String pop = request.getParameter("sex");
        String birthday = request.getParameter("birthday");
        String email = request.getParameter("email");
        if (pop.equals("boy")) {
            sex = 1;
        } else {
            sex = 0;
        }
        User user1 = new User();
        user1.setUsername(username);
        user1.setEmail(email);
        System.out.println(username+" "+sex+" "+email);
        User user2 = userService.userLogin(user1);
        System.out.println(user2);

        Map<String, Object> map = new HashMap<String, Object>();
        if (user2==null) {
            User user = new User();
            user.setId(uid);
            user.setUsername(username);
            user.setPassword(password);
            user.setSex(sex);
            user.setBirthday(birthday);
            user.setEmail(email);
            user.setData(String.valueOf(new Date()));

            int result = userService.insertUser(user);


            if (result == 1) {
                map.put("message", "用户注册成功");
                map.put("code", "1");
            } else {
                map.put("message", "用户注册失败");
                map.put("code", "0");
            }

        }else {
            map.put("message", "用户已注册");
            map.put("code", "2");
        }
        return map;

    }
//    -----------------------------------------------------------------------
//    -------------------------------修改-------------------------------------

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/findpassword", method = RequestMethod.POST)
//    通过邮箱，手机号查询是否存在，存在可以修改，不存在则返回信息请去注册
//    成功后调用updata进行数据库信息的修改
    public Map<String, Object> userFindpassword(HttpServletRequest request) {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");


        User user1 = new User();
        user1.setUsername(username);
        user1.setEmail(email);

        User user2 = userService.userLogin(user1);

        Map<String,Object> map = new HashMap<String,Object>();
        if (user2.getId() != null) {

            User user=new User();
            user.setId(user2.getId());
            user.setPassword(password);

            Integer result1= userService.UpdataPassword(user);

            System.out.println(result1);

            if(result1 == 1){
                map.put("message","用户修改成功");
                map.put("code","1");
            }else {
                map.put("message","用户修改失败");
                map.put("code","0");
            }

        }else{
            map.put("message","用户不存在请重新输入");
            map.put("code","2");
        }
        return  map;
    }
//    --------------------------------------------------------------------
//    -------------------用户信息展示---------------------------------------
@ResponseBody
//处理带参数的
@RequestMapping(value = "/userassage", method = RequestMethod.POST)
public Map user(HttpServletRequest request){

    HttpSession session = request.getSession();
    String id = (String)session.getAttribute("id");
    String username = (String)session.getAttribute("username");
    String email = (String)session.getAttribute("email");
    int sex = (int)session.getAttribute("sex");
    String birthday=(String)session.getAttribute("birthday");
    String pop;

    Map map=new HashMap();
    map.put("id",id);
    map.put("username",username);
    map.put("sex",sex);
    map.put("email",email);
    map.put("birthday",birthday);

    System.out.println(map);
    return map;
}
    @ResponseBody
//处理带参数的
    @RequestMapping(value = "/usermassagefind", method = RequestMethod.POST)
    public Map usermassage(HttpServletRequest request){
        int sex;
        HttpSession session = request.getSession();
        String id = (String)session.getAttribute("id");
        String username = request.getParameter("username");
        String pop = request.getParameter("sex");
        String birthday = request.getParameter("data");
        String email = request.getParameter("email");
        if (pop.equals("boy")) {
            sex = 1;
        } else {
            sex = 0;
        }
        System.out.println(id+" "+username+" "+sex+" "+birthday+" "+email);
        User user =new User();
        user.setId(id);
        user.setUsername(username);
        user.setSex(sex);
        user.setEmail(email);
        user.setBirthday(birthday);
        Map<String, Object> map = new HashMap<String, Object>();
        Integer result1= userService.UpdataUsermassage(user);

        if(result1 == 1){
            map.put("message","用户信息修改成功");
            map.put("code","1");
        }else {
            map.put("message","用户信息修改失败");
            map.put("code","0");
        }

        System.out.println(map);
        return map;
    }

}
