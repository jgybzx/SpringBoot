package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author itheima
 * @date 2020/2/11 0:57
 */
//@RestController
    @Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/user/findById")
    public String findById(Long id, HttpServletRequest httpServletRequest) {
        User user = userService.selectById(id);
        httpServletRequest.setAttribute("user", user);
        return "view";
    }
}
