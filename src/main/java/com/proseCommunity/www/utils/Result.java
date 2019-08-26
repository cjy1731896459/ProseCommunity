package com.proseCommunity.www.utils;

import lombok.Data;

@Data
public class Result<T>  {
    private int status;
    private String message;
    private T t;

    public static Result success(Object object){
        Result result = new Result();
        result.setMessage("Success");
        result.setStatus(200);
        result.setT(object);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setMessage("Error");
        result.setStatus(404);
        return result;
    }
}
