package com.data.exception;

import com.data.common.Result;
import com.data.common.ResultEnum;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = GlobalException.class)
    public <T> Result<T> globalExceptionHandler(GlobalException exception) {
        log.error("error.", exception.getMessage());
        return Result.error(exception);
    }

    @ExceptionHandler(value = NullPointerException.class)
    public <T> Result<T> nullPointerExceptionHandler(NullPointerException exception) {
        log.error("NullPointerException. ", exception.getMessage());
        return Result.error(ResultEnum.BODY_NOT_MATCH);
    }

    @ExceptionHandler(value = Exception.class)
    public <T> Result<T> exceptionHandler(Exception exception) {
        log.error("error. ", exception.getMessage());
        return Result.error(ResultEnum.INTERNAL_SERVER_ERROR);
    }
}
