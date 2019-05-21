package com.lance.boot.web.mapper;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 21:38
 * @Description:
 */

import com.lance.boot.web.entity.ProjectInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 21:38
 * @Description:
 *
 */
@Mapper
public interface ProjectInfoMapper {

    @Insert({ "insert into project_info(id, code, user_id, name, project_info_status," +
            "leader_code,leader_name,depart_id,depart_name,begin_time,end_time,status_time," +
            "jhi_describe,remark,create_user,create_time,update_user,is_delete,type_id) " +
            "values(#{id}, #{code}, #{userId}, #{name}, #{projectInfostatus}, #{leadercode}, " +
            "#{leaderName}, #{departId}, #{departName}, #{beginTime, jdbcType=TIMESTAMP}}, #{endTime, jdbcType=TIMESTAMP}}, " +
            "#{statusTime},#{jhiDescribe},#{remark},#{createUser},#{createTime, jdbcType=TIMESTAMP}}," +
            "#{updateUser},#{isDelete},#{typeId})" })
    int insertProjectInfo(ProjectInfo projectInfo);

}
