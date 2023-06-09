package com.sp.util;

public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Object object){
        Result result = new Result();
        result.setCode(ResultCode.ERROR.getCode());
        result.setMsg(ResultCode.ERROR.getMsg());
        result.setData(object);
        return result;
    }
}
