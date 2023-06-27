package com.renchuan.boot.controller;

import com.google.gson.Gson;
import com.renchuan.boot.entity.User;
import com.renchuan.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("index")
    public String index() {
        return "hello world";
    }

    @GetMapping("time")
    public String getTime() {
        return userService.getTime().toString();

    }

    @PostMapping("/login")
    public String login(User user) {
        return userService.login(user);
    }

//    @GetMapping("userList")
//    public String getUserList() {
//        return userService.getUserList();
//    }

    @GetMapping("userList")
    public String getUserList(){
        Gson gson = new Gson();
        return gson.toJson(userService.getUserList());
    }

    @GetMapping("user/{id}")
    public String getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
}
