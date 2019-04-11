package com.lance.boot.web.controller;

import com.lance.boot.web.entity.User;
import com.lance.boot.web.exception.GlobalException;
import com.lance.boot.web.mapper.UserMapper;
import com.lance.boot.web.util.CodeMsg;
import com.lance.boot.web.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-03-29 16:38
 * @Description:
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user")
    public User getUser() {

        return null;
    }

    @GetMapping("/index")
    public Result index(String name) {
        int j = 50 / 0;
        if (StringUtils.isEmpty(name)) {
            //抛出自定义异常 CodeMsg为自定义的异常码
            throw new GlobalException(CodeMsg.BIND_ERROR.fillArgs("ceshi"));
        }

        return Result.success("ceshi");
    }
}
