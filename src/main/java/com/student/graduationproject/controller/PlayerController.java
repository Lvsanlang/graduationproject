package com.student.graduationproject.controller;

import com.student.graduationproject.model.Player.Player;
import com.student.graduationproject.service.PlayerService;
import com.student.graduationproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//拦截url的地址
@Controller
//@RequestMapping("/user")用来指定处理请求 路径
@RequestMapping("/lvsanlang/player")
public class PlayerController {
    @Resource
    PlayerService playerService;

    @ResponseBody
    //处理带参数的
//    ------------------------------登录------------------------------------
    @RequestMapping(value = "/numbernine", method = RequestMethod.POST)
//通过获得前台信息进行后台查询对前台返回所有信息
    public List playernumbernine(HttpServletRequest request) {
       String playername = request.getParameter("playername");
       String playerdata=request.getParameter("playerdata");
       String playerhigh=request.getParameter("playerhigh");
       String playerweight=request.getParameter("playerweight");

        Player player = new Player();
        player.setPlayerName(playername);
        player.setSeason(playerdata);
        player.setPlayerHeight(playerhigh);
        player.setPlayerWeight(playerweight);
        List<Player> result=playerService.playerSelectAll(player);

        System.out.println(result.toString());
        return result;
    }
}
