package com.imooc.girl.util;

public class ResultMap {


    public static Result sucess(Object object){
            Result result = new Result();
            result.setCode(0);
            result.setMsg("成功");
            result.setData(object);
            return  result;
    }


    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(1);
        result.setMsg(msg);
        result.setData("nul;");
        return  result;
    }
}
