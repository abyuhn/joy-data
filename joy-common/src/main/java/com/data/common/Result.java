package com.data.common;

import com.data.exception.GlobalException;
import lombok.Data;

/**
 * 统一返回接口的工具类
 * @param <T>
 */

@Data
public class Result<T> {

    private Integer code;
    private String msg;
    private T data;

    public static<T> Result<T> success(){
        return success(null);
    }

    public static<T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    public static<T> Result<T> error(Integer code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static<T> Result<T> error(ResultEnum re) {
        return error(re.getCode(), re.getMsg());
    }

    public static<T> Result<T> error(GlobalException e) {
        return error(e.getCode(), e.getMessage());
    }

}
