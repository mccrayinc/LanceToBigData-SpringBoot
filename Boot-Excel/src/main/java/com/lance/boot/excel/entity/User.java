package com.lance.boot.excel.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 21:24
 * @Description:
 *
 */
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Size(max = 32)
    private String id;


    @Column(name = "user_id")
    private String userId;

    @Column(name = "name")
    private String name;

}
