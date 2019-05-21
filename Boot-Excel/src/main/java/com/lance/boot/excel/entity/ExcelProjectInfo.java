package com.lance.boot.excel.entity;


import com.lance.boot.excel.anno.ExcelColumn;
import lombok.Data;

import java.io.Serializable;

@Data
public class ExcelProjectInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelColumn(value = "id", col = 0)
    private String id;

    /**
     * 编码
     */
    @ExcelColumn(value = "code", col = 1)
    private String code;

    /**
     * 用户ID
     */
    @ExcelColumn(value = "user_id", col = 2)
    private String userId;

    /**
     * 名称
     */
    @ExcelColumn(value = "name", col = 3)
    private String name;

    /**
     * 状态
     */
    @ExcelColumn(value = "project_info_status", col = 4)
    private String projectInfoStatus;

    /**
     * 负责人编码
     */
    @ExcelColumn(value = "leader_code", col = 5)
    private String leaderCode;

    /**
     * 负责人姓名
     */
    @ExcelColumn(value = "id", col = 6)
    private String leaderName;

    /**
     * 部门id
     */
    @ExcelColumn(value = "depart_id", col = 7)
    private String departId;

    /**
     * 部门名称
     */
    @ExcelColumn(value = "depart_name", col = 8)
    private String departName;

    /**
     * 开始时间
     */
    @ExcelColumn(value = "begin_time", col = 9)
    private String beginTime;

    /**
     * 结束时间
     */
    @ExcelColumn(value = "end_time", col = 10)
    private String endTime;

    /**
     * 状态日期
     */
    @ExcelColumn(value = "status_time", col =11)
    private String statusTime;


    /**
     * 简介
     */
    @ExcelColumn(value = "jhi_describe", col = 12)
    private String jhiDescribe;

    /**
     * 备注
     */
    @ExcelColumn(value = "remark", col = 13)
    private String remark;

    /**
     * 创建人
     */
    @ExcelColumn(value = "create_user", col = 15)
    private String createUser;

    /**
     * 创建时间
     */
    @ExcelColumn(value = "create_time", col = 14)
    private String createTime;

    /**
     * 修改人
     */
//    @Excel(name = "id", orderNum = "0")
    private String upStringUser;

    /**
     * 修改时间
     */
//    @Excel(name = "id", orderNum = "0")
    private String upStringTime;

    /**
     * 是否删除
     */
    @ExcelColumn(value = "is_delete", col = 16)
    private Boolean isDelete;

    /**
     * 类型
     */
    @ExcelColumn(value = "type_id", col = 17)
    private String typeId;

}
