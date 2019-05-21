package com.lance.boot.excel.repository;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-28 11:54
 * @Description:
 */

import com.lance.boot.excel.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-28 11:54
 * @Description:
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

      User findByUserId(String userId);
}
