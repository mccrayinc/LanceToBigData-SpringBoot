package com.lance.boot.excel.controller;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 20:47
 * @Description:
 */

import com.lance.boot.excel.entity.ExcelProjectInfo;
import com.lance.boot.excel.service.ExcelService;
import com.lance.boot.excel.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 20:47
 * @Description:
 */
@RestController
public class ExcelController {
    @Autowired
    private ExcelService excelService;

    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    public void importExcel(MultipartFile file) {
        List<ExcelProjectInfo> projectInfos = ExcelUtils.readExcel("", ExcelProjectInfo.class, file);
            excelService.excel(projectInfos);
        for (ExcelProjectInfo projectInfo : projectInfos){
            System.out.println(projectInfo);
            System.out.println("===================");
        }
    }

    @RequestMapping(value = "/count", method = RequestMethod.POST)
    public void countDepart(MultipartFile file) {
        List<ExcelProjectInfo> projectInfos = ExcelUtils.readExcel("", ExcelProjectInfo.class, file);
        excelService.excel(projectInfos);
        List<String> countDeaprt = new ArrayList<>();
        for (ExcelProjectInfo projectInfo : projectInfos){
            if (!countDeaprt.contains(projectInfo.getDepartId())){
                countDeaprt.add(projectInfo.getDepartId());
            }
        }

        System.out.println("=======================================");
        System.out.println(countDeaprt.size());
        System.out.println("========你好======");
        System.out.println(countDeaprt.toString());
        System.out.println("=======================================");
    }
}
