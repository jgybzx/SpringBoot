package com.itheima.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author itheima
 * @date 2020/2/14 14:22
 */
@Data
@TableName("t_user")
public class User {

    private Long id;
    private String name;
    private Integer age;
}
