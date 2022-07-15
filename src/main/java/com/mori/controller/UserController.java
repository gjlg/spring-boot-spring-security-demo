package com.mori.controller;

import com.mori.entity.User;
import com.mori.repo.ResponseResult;
import com.mori.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yun_kai
 * @date 2022年07月15日, 0015
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }
}
