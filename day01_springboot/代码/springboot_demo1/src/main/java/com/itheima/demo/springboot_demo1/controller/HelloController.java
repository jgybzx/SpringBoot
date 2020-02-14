package com.itheima.demo.springboot_demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itheima
 * @date 2020/2/14 9:22
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String sayHello() {
        return "hello, spring boot!";
    }

}
