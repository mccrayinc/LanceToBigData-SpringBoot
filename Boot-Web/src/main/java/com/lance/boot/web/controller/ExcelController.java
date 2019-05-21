package com.lance.boot.web.controller;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 20:47
 * @Description:
 */

import com.lance.boot.web.entity.ExcelProjectInfo;
import com.lance.boot.web.service.ExcelService;
import com.lance.boot.web.util.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
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
        try {
            excelService.excel(projectInfos);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        for (ExcelProjectInfo projectInfo : projectInfos){
            System.out.println(projectInfo);
            System.out.println("===================");
        }
    }
}
