package com.itheima.sevice.impl;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import com.itheima.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author itheima
 * @date 2020/2/14 11:29
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }
}
