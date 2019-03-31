package com.lance.boot.web.mapper;

import com.lance.boot.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    /**
     * 根据ID查询user
     * @param id
     * @return
     */
    @Select("select *from User where user_id=#{id}")
    public User queryByUserId(@Param("id")int id);
}