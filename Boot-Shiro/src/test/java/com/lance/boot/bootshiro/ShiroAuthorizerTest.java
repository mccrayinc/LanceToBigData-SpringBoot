package com.lance.boot.bootshiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

/**
 * @author： zhangyinhua(LanceToBigData)
 * @description: 测试Shiro授权过程
 * @date 2019/3/319:30
 */
public class ShiroAuthorizerTest {
    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void adddUser() {
        //添加用户，给予admin角色(角色是一个可变参数可以给予过个角色)
        simpleAccountRealm.addAccount("lance", "12345", "admin", "user");
    }

    @Test
    public void testAuthorizer() {
        //1.构建securityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);

        //2.主体提交认证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("lance", "12345");
        subject.login(token);

        System.out.println("是否认证成功:" + subject.isAuthenticated());

        //检查角色
        subject.checkRole("admin");
        //检查多个角色
        subject.checkRoles("admin", "user");
    }
}
