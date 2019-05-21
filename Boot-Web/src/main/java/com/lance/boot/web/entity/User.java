package com.lance.boot.web.entity;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 21:24
 * @Description:
 */

import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 21:24
 * @Description:
 *
 */
@Mapper
public class User {
    private String id;
    private String userId;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
