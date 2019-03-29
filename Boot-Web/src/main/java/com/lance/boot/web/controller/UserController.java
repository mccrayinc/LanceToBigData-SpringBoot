package com.lance.boot.web.controller;

import com.lance.boot.web.entity.User;
import com.lance.boot.web.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-03-29 16:38
 * @Description:
 *
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public User getUser(){

        return null;
    }
}
