package com.demo.userservice.common;
import lombok.Data;

/**
 * 全局统一返回结果类
 * 所有接口统一返回格式：状态码、提示语、数据，方便前端统一处理
 * @param <T> 泛型：适配任意类型数据
 */
@Data // 自动生成get/set、toString方法
public class Result<T> {
    // 响应状态码：200成功，500失败
    private Integer code;
    // 响应提示信息
    private String msg;
    // 响应业务数据
    private T data;

    /**
     * 成功返回方法
     * @param data 接口查询/操作的数据
     * @return 统一结果对象
     */
    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    /**
     * 失败返回方法
     * @param msg 失败提示
     * @return 统一结果对象
     */
    public static <T> Result<T> fail(String msg){
        Result<T> result = new Result<>();
        result.setCode(500);
        result.setMsg(msg);
        return result;
    }
}