package com.itheima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author itheima
 * @date 2020/2/10 21:44
 */
@SpringBootApplication
@MapperScan("com.itheima.mapper")
public class springBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(springBootDemoApplication.class, args);
    }
}
