package com.lance.boot.bootshiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

/**
 * @author： zhangyinhua(LanceToBigData)
 * @description:
 * @date 2019/3/3 19:35
 */
public class IniRealmTest {
    @Test
    public void testIniRealm() {
        //1.创建一个IniRealm
        IniRealm iniRealm = new IniRealm("classpath:user.ini");

        //2.构建securityManager环境
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(iniRealm);

        //3.主体提交认证
        SecurityUtils.setSecurityManager(defaultSecurityManager);
        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("lance", "12345");
        subject.login(token);

        System.out.println("是否认证成功:" + subject.isAuthenticated());

        //检查角色
        subject.checkRole("admin");

        //admin角色是否具备用户删除的权限
        subject.checkPermission("user:delete");

        //admin角色是否具备用户删除,更新的权限
        subject.checkPermissions("user:delete","user:update");
    }
}
