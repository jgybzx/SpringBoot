package com.itheima.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> { //UserDao

    //通过id来获取用户信息
//    User findById(Long id);

}
