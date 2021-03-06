package com.faisco.sqldemo.util;

public class ResultUtil {
    /**
     * 请求成功返回
     * @param object
     * @return
     */
    public static Result success(Object object){
        Result Result=new Result();
        Result.setCode(200);
        Result.setMsg("请求成功");
        Result.setData(object);
        return Result;
    }
    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result Result=new Result();
        Result.setCode(code);
        Result.setMsg(msg);
        return Result;
    }

}
