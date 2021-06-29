package com.student.graduationproject.service.Impl;

import com.student.graduationproject.dao.mapper.PlayerMapper;
import com.student.graduationproject.model.Player.Player;
import com.student.graduationproject.model.Player.PlayerExample;
import com.student.graduationproject.service.PlayerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Resource
    PlayerMapper playerMapper;

    @Override
    public List<Player> playerSelectAll(Player player) {

        System.out.println(player.getPlayerName());
        System.out.println(player.getPlayerHeight());
        System.out.println(player.getPlayerWeight());
        System.out.println(player.getSeason());

        PlayerExample playerExample =new PlayerExample();
        PlayerExample.Criteria criteria =playerExample.createCriteria();
        System.out.println(player.getPlayerName() != "");
        System.out.println(player.getPlayerWeight()!="");
        if(player.getPlayerWeight()!=""){
            criteria.andPlayerWeightEqualTo(player.getPlayerWeight());
        }
        if(player.getPlayerName() != ""){
            criteria.andPlayerNameEqualTo(player.getPlayerName());
        }
        if(player.getSeason() != ""){
            criteria.andSeasonEqualTo(player.getSeason());
        }
        if(player.getPlayerHeight() != "") {
            criteria.andPlayerHeightEqualTo(player.getPlayerHeight());
        }

//        criteria.andPlayerWeightEqualTo("81.64656");

        return playerMapper.selectAll(playerExample);
    }
}
