package com.itheima.sevice;

import com.itheima.domain.User;

public interface UserService {

    //通过id查询用户信息
    User findById(Long id);

}
