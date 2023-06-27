package com.renchuan.boot.mapper;

import com.renchuan.boot.entity.User;

import java.util.List;

public interface UserMapper {
    //    List<User> getUser();

    List<User> getUser();

    String getPwdByUserName(String userName);

    User getUserById(Integer id);
}
