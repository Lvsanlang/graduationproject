package com.student.graduationproject.service;

import com.student.graduationproject.model.Player.Player;
import com.student.graduationproject.model.Player.PlayerExample;

import java.util.List;

public interface PlayerService {
    List<Player> playerSelectAll(Player player);
}
