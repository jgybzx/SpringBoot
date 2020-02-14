package com.itheima.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user where id= #{id}")
    User findById(Long id);

    @Delete("delete from t_user where id = #{id}")
    void deleteById(Long id);

}
