package com.lance.boot.bootshiro;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.catalina.realm.JDBCRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.jdbc.JdbcRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * @author： zhangyinhua(LanceToBigData)
 * @description:
 * @date 2019/3/319:51
 */
public class JDBCRealmTest {
    DruidDataSource dataSource = new DruidDataSource();

    {
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/shirotest?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");
    }


    /**
     * 在我们实际项目中不可能去使用默认的Realm，比如JdbcRealm我们设计表不可能和他默认的一致
     */
    @Test
    public void testIniRealm() {
        //1.创建一个JDBCRealm
        JdbcRealm jdbcRealm = new JdbcRealm();
        jdbcRealm.setDataSource(dataSource);
        //JdbcRealm默认不开启查询权限,需要自己手动设置
        jdbcRealm.setPermissionsLookupEnabled(true);

        //2.构建securityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        //在ecurityManager环境设置realm
        defaultSecurityManager.setRealm(jdbcRealm);

        //3.主体提交认证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("lance", "12345");
        subject.login(token);

        System.out.println("是否认证成功:" + subject.isAuthenticated());

        //检查角色
        subject.checkRole("admin");
        //检查多个角色
        subject.checkRoles("admin","user");

        //检查权限
        subject.checkPermission("user:select");
    }
}
