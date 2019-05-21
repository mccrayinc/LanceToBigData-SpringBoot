package com.lance.boot.excel.service;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-28 11:38
 * @Description:
 */

import com.lance.boot.excel.entity.Depart;
import com.lance.boot.excel.entity.ExcelProjectInfo;
import com.lance.boot.excel.entity.ProjectInfo;
import com.lance.boot.excel.entity.User;
import com.lance.boot.excel.repository.DepartRepository;
import com.lance.boot.excel.repository.ProjectInfoRepository;
import com.lance.boot.excel.repository.UserRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-28 11:38
 * @Description:
 */
@Service
public class ExcelService {

    @Autowired
    private ProjectInfoRepository projectInfoRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DepartRepository departRepository;


    public void excel(List<ExcelProjectInfo> excelProjectInfos) {
        List<ProjectInfo> projectInfoList = new ArrayList<>();
        for (ExcelProjectInfo excelProjectInfo : excelProjectInfos) {
            ProjectInfo projectInfo = new ProjectInfo();
            projectInfo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            projectInfo.setCode(excelProjectInfo.getCode());
            projectInfo.setUserId(excelProjectInfo.getUserId());
            if (StringUtils.isNotEmpty(excelProjectInfo.getName())) {
                projectInfo.setName(excelProjectInfo.getName());
            }
            projectInfo.setProjectInfoStatus("ING");
            projectInfo.setLeaderCode(excelProjectInfo.getLeaderCode());
            User byUserId = userRepository.findByUserId(excelProjectInfo.getLeaderCode());
            projectInfo.setLeaderName(byUserId.getName());
            Depart byCode = departRepository.findByName(excelProjectInfo.getDepartName().trim());
            if (byCode != null) {
                projectInfo.setDepartId(byCode.getDepartId());
                projectInfo.setDepartName(byCode.getName());

            }
//            projectInfo.setBeginTime(excelProjectInfo.getBeginTime());
            if (StringUtils.isNotEmpty(excelProjectInfo.getJhiDescribe())) {
            }
//            projectInfo.setCreateTime(excelProjectInfo.getCreateTime());
            projectInfo.setCreateUser(byUserId.getName());
            Date date = new Date(excelProjectInfo.getBeginTime());
            projectInfo.setBeginTime(date);
            if (StringUtils.isNotEmpty(excelProjectInfo.getEndTime())){
                projectInfo.setEndTime(new Date(excelProjectInfo.getEndTime()));
            }
            projectInfo.setCreateTime(date);
            projectInfo.setIsDelete(false);
            if (excelProjectInfo.getDepartName().equals("养生用品研发".trim())){
                projectInfo.setTypeId("59e8045e050643f2876ef06e323f1dd3");
            }else {
                projectInfo.setTypeId("80946f64dd204a86ab30a6b78b40b0d7");
            }
            projectInfoList.add(projectInfo);

        }
        projectInfoRepository.saveAll(projectInfoList);
    }
}
