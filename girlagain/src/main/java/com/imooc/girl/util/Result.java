package com.imooc.girl.util;

public class Result<T> {
    //状态码
    public Integer code;

    //返回值
    public String msg;

    //提示信息
    public T data;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
