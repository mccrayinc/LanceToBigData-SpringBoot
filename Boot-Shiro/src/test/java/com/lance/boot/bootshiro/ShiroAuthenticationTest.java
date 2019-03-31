package com.lance.boot.bootshiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;

/**
 * @author： zhangyinhua(LanceToBigData)
 * @description: 测试Shiro认证过程
 * @date 2019/3/3 19:19
 */
public class ShiroAuthenticationTest {
    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    @Before
    public void adddUser(){
        simpleAccountRealm.addAccount("lance","12345");
    }

    @Test
    public void testAuthentication(){
        //1.构建securityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm);

        //2.主体提交认证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token =new UsernamePasswordToken("lance","12345");
        subject.login(token);

        System.out.println("是否认证成功:"+subject.isAuthenticated());

        //模拟退出
/*        subject.logout();
        System.out.println("是否认证成功:"+subject.isAuthenticated());*/

    }

}
