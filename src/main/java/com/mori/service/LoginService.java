package com.mori.service;

import com.mori.entity.User;
import com.mori.repo.ResponseResult;

/**
 * @author yun_kai
 * @date 2022年07月15日, 0015
 */
public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();
}
