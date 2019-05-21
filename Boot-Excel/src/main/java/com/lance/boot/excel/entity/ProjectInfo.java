package com.lance.boot.excel.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;


@Data
@Entity
@Table(name = "project_info")
public class ProjectInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Size(max = 32)
    private String id;

    /**
     * 编码
     */
    @NotNull
    @Size(max = 50)
    @Column(name = "code", length = 50, nullable = false)
    private String code;

    /**
     * 名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 状态
     */
    @NotNull
    @Column(name = "project_info_status")
    private String projectInfoStatus;

    /**
     * 负责人编码
     */
    @Column(name = "leader_code")
    private String leaderCode;

    /**
     * 负责人姓名
     */
    @Column(name = "leader_name")
    private String leaderName;
    /**
     * 部门id
     */
    @Size(max = 32)
    @Column(name = "depart_id")
    private String departId;

    /**
     * 部门名称
     */
    @Column(name = "depart_name", length = 32)
    private String departName;

    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 状态日期
     */
    @Column(name = "status_time")
    private Date statusTime;

    /**
     * 用户ID
     */
    @Size(max = 32)
    @Column(name = "user_id", length = 32)
    private String userId;

    /**
     * 简介
     */
    @Size(max = 256)
    @Column(name = "jhi_describe", length = 256)
    private String describe;

    /**
     * 备注
     */
    @Size(max = 1024)
    @Column(name = "remark", length = 1024)
    private String remark;

    /**
     * 创建人
     */
    @Size(max = 32)
    @Column(name = "create_user", length = 32)
    private String createUser;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改人
     */
    @Size(max = 32)
    @Column(name = "update_user", length = 32)
    private String updateUser;

    /**
     * 修改时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;


    /**
     * 类型
     */
    @NotNull
    @Column(name = "type_id")
    private String typeId;


}
