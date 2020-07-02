//package com.example.demogradle.handler;
//
//import com.example.demogradle.exception.DefinitionException;
//import com.example.demogradle.util.Result;
//import com.example.demogradle.util.ResultEnum;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
///**
// * @author ShaoJie
// * @Date 2020年07月02 11:35
// * @Description:
// * <p>
// *    @ControllerAdvice+@ResponseBody，开启全局的异常捕获，返回JSON
// * </p>
// */
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    /**
//     * 处理自定义异常
//     *
//     * @return Result
//     * @ExceptionHandler 说明捕获哪些异常，对那些异常进行处理。
//     */
//    @ExceptionHandler(value = DefinitionException.class)
//    public Result<Object> customExceptionHandler(DefinitionException e) {
//        return Result.defineError(e);
//   }
//
//    /**
//     * 处理其他异常
//     *
//     * @return Result
//     */
//    @ExceptionHandler(value = Exception.class)
//    public Result<Object> exceptionHandler(Exception e) {
//        return Result.otherError(ResultEnum.SERVER_ERROR);
//    }
//}