package com.renchuan.boot;

import com.renchuan.boot.entity.User;
import com.renchuan.boot.service.UserService;
import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Log
public class UserServiceTests {

    @Autowired
    UserService userService;

    @BeforeEach
    public void setUp() throws Exception {
    }

    @Test
    public void testGetTime() throws Exception {
        Assert.assertNotNull(userService.getTime());
    }
    //write the Junit tests for all methods in the UserService class
    @Test
    public void testLogin() throws Exception{
        Assert.assertEquals("success",userService.login(new User("admin","123")));
        Assert.assertEquals("user not exists",userService.login(new User("admin","123456")));
    }

    @Test
    public void testGetUserList() throws Exception{
        Assert.assertNotNull(userService.getUserList());
    }

    @Test
    public void testGetUserById() throws Exception{
        Assert.assertNotNull(userService.getUserById(1));
    }

    //如何测试UserServiceImpl中的getUserList()方法？
}
