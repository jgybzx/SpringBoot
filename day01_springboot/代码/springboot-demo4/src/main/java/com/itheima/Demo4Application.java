package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author itheima
 * @date 2020/2/14 14:17
 */
@SpringBootApplication //通过此注解，将此类变为启动类
@MapperScan("com.itheima.mapper")
public class Demo4Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo4Application.class, args);
    }
}
