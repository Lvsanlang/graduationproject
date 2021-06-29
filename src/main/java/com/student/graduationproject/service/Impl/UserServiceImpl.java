package com.student.graduationproject.service.Impl;

import com.student.graduationproject.dao.mapper.UserMapper;
import com.student.graduationproject.model.Player.PlayerExample;
import com.student.graduationproject.model.User.User;
import com.student.graduationproject.model.User.UserExample;
import com.student.graduationproject.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public int userRegister(User user) {

        return userMapper.insert(user);
    }

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public List<User> userSelectIndex(UserExample example) {
        return userMapper.selectByExample(example);
    }
//查询返回id
    @Override
    public User userLogin(User user) {
        return  userMapper.selectUserName(user);
    }
//通过手机号，邮箱 修改密码
    @Override
    public Integer UpdataPassword(User user) {
        return userMapper.UserPassword(user);
    }

    @Override
    public Integer UpdataUsermassage(User user) {

//        UserExample userExample = new UserExample();
//        UserExample.Criteria criteria = userExample.createCriteria();
//
//        criteria.andIdEqualTo(user.getId());
//        criteria.andUsernameEqualTo(user.getUsername());
//        criteria.andBirthdayEqualTo(user.getBirthday());
//        criteria.andSexEqualTo(user.getSex());
//        criteria.andEmailEqualTo(user.getEmail());

        return userMapper.updateusermassage(user);
    }


}
