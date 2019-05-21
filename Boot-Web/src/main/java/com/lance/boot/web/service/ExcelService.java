package com.lance.boot.web.service;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 22:08
 * @Description:
 */

import com.lance.boot.web.entity.ExcelProjectInfo;
import com.lance.boot.web.entity.ProjectInfo;
import com.lance.boot.web.mapper.ProjectInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 22:08
 * @Description:
 *
 */
@Service
public class ExcelService {
    @Autowired
    private ProjectInfoMapper projectInfoMapper;


    public void excel(List<ExcelProjectInfo> excelProjectInfos) throws ParseException {


        for (ExcelProjectInfo excelProjectInfo : excelProjectInfos){
            ProjectInfo projectInfo = new ProjectInfo();
            projectInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
            projectInfo.setCode(excelProjectInfo.getCode());
            projectInfo.setUserId(excelProjectInfo.getUserId());
            if (StringUtils.isNotEmpty(excelProjectInfo.getName())){
                projectInfo.setName(excelProjectInfo.getName());
            }
            projectInfo.setProjectInfoStatus("ING");
            if (StringUtils.isNotEmpty(excelProjectInfo.getLeaderCode())){
                projectInfo.setLeaderCode(excelProjectInfo.getLeaderCode());
            }
            projectInfo.setDepartId(excelProjectInfo.getDepartId());
            projectInfo.setDepartName(excelProjectInfo.getDepartName());
            projectInfo.setBeginTime(new Date());
            if (StringUtils.isNotEmpty(excelProjectInfo.getJhiDescribe())){
                projectInfo.setJhiDescribe(excelProjectInfo.getJhiDescribe());
            }
            projectInfo.setCreateTime(new Date());
            projectInfo.setDelete(false);
            projectInfo.setTypeId(excelProjectInfo.getTypeId());

            projectInfoMapper.insertProjectInfo(projectInfo);

        }
    }
}
