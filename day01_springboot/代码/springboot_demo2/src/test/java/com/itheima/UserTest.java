package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author itheima
 * @date 2020/2/11 1:42
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private Environment environment;

    @Test
    public void sayHello(){
        System.out.println("hello!");
        String temp = environment.getProperty("name");
        System.out.println(temp);
    }
}
