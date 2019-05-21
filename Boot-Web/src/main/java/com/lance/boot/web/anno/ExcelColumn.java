package com.lance.boot.web.anno;/**
 * @author: Lance(ZYH)
 * @Date: 2019-04-27 20:55
 * @Description:
 */

import java.lang.annotation.*;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-27 20:55
 * @Description:
 *
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelColumn {

    String value() default "";

    int col() default 0;
}