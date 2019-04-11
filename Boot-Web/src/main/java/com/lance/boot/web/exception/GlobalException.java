package com.lance.boot.web.exception;

import com.lance.boot.web.util.CodeMsg;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-10 16:04
 * @Description: 全局异常处理
 */
public class GlobalException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
