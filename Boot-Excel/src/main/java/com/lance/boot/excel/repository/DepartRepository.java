package com.lance.boot.excel.repository;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-28 13:41
 * @Description:
 */

import com.lance.boot.excel.entity.Depart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-28 13:41
 * @Description:
 *
 */
public interface DepartRepository extends JpaRepository<Depart, String> {

    Depart findByCode(String code);

    Depart findByName(String name);
}
