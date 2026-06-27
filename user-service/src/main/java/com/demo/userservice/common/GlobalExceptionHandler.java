package com.demo.userservice.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    private <T> Result<T> buildResult(Integer code, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    // JSON格式错误捕获
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<Result<Void>> handleJsonError(HttpMessageNotReadableException e) {
        log.error("JSON解析异常", e);
        Result<Void> res = buildResult(400, "JSON格式错误，请检查语法");
        return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
    }

    // 全部其他异常捕获
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Result<Void>> handleAllException(Exception e) {
        log.error("服务器异常", e);
        Result<Void> res = buildResult(500, "服务器内部错误");
        return new ResponseEntity<>(res, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}