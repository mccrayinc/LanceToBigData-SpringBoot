package com.lance.boot.web.entity;

import com.lance.boot.web.anno.ExcelColumn;

import java.io.Serializable;
import java.time.Instant;

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
    private Instant upStringTime;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectInfoStatus() {
        return projectInfoStatus;
    }

    public void setProjectInfoStatus(String projectInfoStatus) {
        this.projectInfoStatus = projectInfoStatus;
    }

    public String getLeaderCode() {
        return leaderCode;
    }

    public void setLeaderCode(String leaderCode) {
        this.leaderCode = leaderCode;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJhiDescribe() {
        return jhiDescribe;
    }

    public void setJhiDescribe(String jhiDescribe) {
        this.jhiDescribe = jhiDescribe;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpStringUser() {
        return upStringUser;
    }

    public void setUpStringUser(String upStringUser) {
        this.upStringUser = upStringUser;
    }

    public Instant getUpStringTime() {
        return upStringTime;
    }

    public void setUpStringTime(Instant upStringTime) {
        this.upStringTime = upStringTime;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", projectInfoStatus='" + projectInfoStatus + '\'' +
                ", leaderCode='" + leaderCode + '\'' +
                ", leaderName='" + leaderName + '\'' +
                ", departId='" + departId + '\'' +
                ", departName='" + departName + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", statusTime=" + statusTime +
                ", jhiDescribe='" + jhiDescribe + '\'' +
                ", remark='" + remark + '\'' +
                ", createUser='" + createUser + '\'' +
                ", createTime=" + createTime +
                ", upStringUser='" + upStringUser + '\'' +
                ", upStringTime=" + upStringTime +
                ", isDelete=" + isDelete +
                ", typeId='" + typeId + '\'' +
                '}';
    }
}
