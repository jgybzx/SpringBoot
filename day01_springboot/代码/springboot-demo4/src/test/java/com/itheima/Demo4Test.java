package com.itheima;

/**
 * @author itheima
 * @date 2020/2/14 14:41
 */

import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) //意味着spring容器中的对象，单元测试都能用到
@SpringBootTest  //会帮你去找项目的唯一入口：启动类
//最好是启动类和此测试类的包名地址一致...
//如果启动类和此测试类的包名地址不一致，那么需要在@SpringBootTest的注解上加(classes = Demo4Application.class)
public class Demo4Test {

    @Test
    public void test() {
        System.out.println(123);
    }
}
