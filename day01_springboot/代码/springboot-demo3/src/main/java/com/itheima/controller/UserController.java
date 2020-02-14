package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.sevice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itheima
 * @date 2020/2/14 11:32
 */
@RestController //1.代码此类下的所有的方法返回都是Json格式的字符串 2.将此类加载到spring容器中
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user") //restful风格 methods=get
    public User findById(Long id) {
        return userService.findById(id);
    }

}
