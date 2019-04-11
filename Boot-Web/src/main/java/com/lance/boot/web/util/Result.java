package com.lance.boot.web.util;

import lombok.Data;

/**
 * @author: 张银华 zhangyinhua@chinasie.com
 * @Date: 2019-04-10 15:55
 * @Description: 返回结果封装
 */
@Data
public class Result<T> {
    /**
     * 提示码
     */
    private int code;
    /**
     * 消息
     */
    private String msg;
    /**
     * 返回提示
     */
    private T data;

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(CodeMsg codeMsg) {
        return new Result<T>(codeMsg);
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(CodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
        }
    }

}
