package com.lance.boot.web.mapper;

import com.lance.boot.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE user_id = #{userId}")
    User findUserByUserId(String userId);
}