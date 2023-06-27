package com.renchuan.boot.service;

import com.renchuan.boot.entity.User;
import com.renchuan.boot.mapper.TimeMapper;
import com.renchuan.boot.mapper.UserMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Log
public class UserService {

    @Autowired
    TimeMapper timeMapper;

    @Autowired
    UserMapper userMapper;

    public LocalDateTime getTime() {
        return timeMapper.now();
    }

    public String login(User user) {
        String pwd = userMapper.getPwdByUserName(user.getName());
        if (user.getPassword().equals(pwd)) {
            return "success";
        } else {
            return "user not exists";
        }
    }

//    public String getUserList() {
//        return userMapper.getUser().toString();
//    }

    public String getUserList(){
        //use userMapper to get user list
        return userMapper.getUser().toString();
    }

    public String getUserById(Integer id) {
        return userMapper.getUserById(id).toString();
    }
}
