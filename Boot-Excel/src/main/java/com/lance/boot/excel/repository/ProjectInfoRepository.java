package com.lance.boot.excel.repository;

import com.lance.boot.excel.entity.ProjectInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-28 11:32
 * @Description:
 *
 */
@Repository
public interface ProjectInfoRepository extends JpaRepository<ProjectInfo, String> {

}
