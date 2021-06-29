package com.student.graduationproject.service;
import com.student.graduationproject.model.User.User;
import com.student.graduationproject.model.User.UserExample;

import java.util.List;

public interface UserService {

//    List<User> getUsername(Integer username);

    int userRegister(User user);

    Integer insertUser(User user);

//    List<User> select();

    List<User> userSelectIndex (UserExample example);

    User userLogin(User user);

    Integer UpdataPassword(User user);

    Integer UpdataUsermassage(User user);

}
