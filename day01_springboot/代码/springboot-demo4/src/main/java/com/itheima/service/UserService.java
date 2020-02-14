package com.itheima.service;

import com.itheima.domain.User;

public interface UserService {

    //通过id查询用户
    User findById(Long id);
}
