package com.student.graduationproject.controller.pub;

import com.student.graduationproject.util.email.Mail;
import com.student.graduationproject.util.email.SendMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/lvsanlang/public")
public class publicController {
    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/emailhint", method = RequestMethod.POST)
//    email的type类型的请求操作，如果1则是注册操作邮箱发送内容为注册内容
//    如果type类型为2则发送修改相关文件信息
//    存储生成的code码
//    当信息发送时，code有效时长60秒
//    调用发送邮件
    public void emailHint (HttpServletRequest request) throws Exception{

        String  usermail = request.getParameter("email");

        Mail mail =new Mail();
        mail.setEmail(usermail);

        String type = request.getParameter("type");
        System.out.println(type);
        if (type.equals("1")){
//            注册
            mail.setTitle("注册使用");

        }else  if(type.equals("2")){
//            找回密码
            mail.setTitle("找回使用");

        }
//        获取code编码
        String code = mail.makecode();
        mail.setCode(code);
        System.out.println(code);

        //存储code码以便于校验
        HttpSession session = request.getSession();
        session.setAttribute(usermail,code);
        session.setMaxInactiveInterval(60);
        //发送邮件
        SendMail.sendMail(mail);

    }

    @ResponseBody
    //处理带参数的
    @RequestMapping(value = "/emailenter", method = RequestMethod.GET)
//    当前台code失焦验证是触发
//    此时有三种情况 ：输入值为空 输入值正确  输入值错误 看情况进行讨论
    public Map<String, Object> emailenter (HttpServletRequest request) throws Exception{
        String InputEmail = request.getParameter("emailcode");
        String  usermail = request.getParameter("sendemail");

        HttpSession session = request.getSession();
        session.getAttribute(usermail);

        Map<String,Object> map = new HashMap<String,Object>();

        if(session.getAttribute(usermail) == null){
            map.put("code","2");
            map.put("message","验证码失效");
        }else if(InputEmail.equals(session.getAttribute(usermail))){
            map.put("code","1");
            map.put("message","成功");

        }else{
            map.put("code","0");
            map.put("message","失败");
        }
        return map;

    }



}
