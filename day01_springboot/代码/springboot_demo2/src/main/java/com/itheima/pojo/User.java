package com.itheima.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author itheima
 * @date 2020/2/11 0:40
 */
@Data
@TableName(value = "t_user")
public class User {

    private Long id;
    private String name;
    private Integer age;
}
