package com.lance.boot.web.util;

import lombok.Data;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-10 15:57
 * @Description:
 */
@Data
public class CodeMsg {
    private int code;
    private String msg;
    //错码定义误
    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(50000, "服务端异常");
    public static CodeMsg BIND_ERROR = new CodeMsg(50001, "参数校验异常：%s");
    public static CodeMsg REQUEST_ILLEGAL = new CodeMsg(50002, "请求非法");

    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.msg, args);
        return new CodeMsg(code, message);
    }

}
