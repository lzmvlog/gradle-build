package com.example.demogradle.util;

import lombok.Data;

/**
 * @author ShaoJie
 * @Date 2020年07月02 11:35
 * @Description:
 */
@Data
public class Result<T> {
    /**
     * 状态码
     */
    private Integer code;//状态码
    /**
     * 提示信息
     */
    private String message;//提示消息
    /**
     * 数据
     */
    private T data;//数据

    public Result() {
    }

    /**
     * @param code    响应码
     * @param message 响应信息
     */
    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * @param code    响应码
     * @param message 响应信息
     * @param data    数据
     */
    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @param resultEnum 自定义枚举类，包含 code 和 message
     */
    public Result(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
    }

    /**
     * @param resultEnum 自定义枚举类，包含 code 和 message
     * @param data       数据
     */
    public Result(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }

//    /**
//     * 自定义异常返回的结果
//     *
//     * @param definitionException 自定义异常处理类
//     * @return 返回自定义异常
//     */
//    public static Result<Object> defineError(DefinitionException definitionException) {
//        return new Result<>(definitionException.getErrorCode(), definitionException.getErrorMessage());
//    }

    /**
     * 其他异常处理方法返回的结果
     *
     * @param resultEnum 自定义枚举类，包含 code 和 message
     * @return 返回其他异常
     */
    public static Result<Object> otherError(ResultEnum resultEnum) {
        return new Result<>(resultEnum);
    }

}