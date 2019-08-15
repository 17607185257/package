package com.imooc.girl;


public enum ResultEnum {
    UNKNOWN_ERROR(0,"未知错误"),
   SUCCESS(1,"成功"),
    PRIMARY_SCHOOEL(2,"你可能还在上小学"),
    MIDDLE_SCHOOL(3,"好了 你上初中了"),
    MAN_SCHOOL(4," you are  good  man"),
    NO_USER(5,"没有找到对应的用户");

    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

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
}
