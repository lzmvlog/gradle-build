package com.example.demogradle.controller;

import com.example.demogradle.util.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShaoJie
 * @Date 2020年07月02 10:55
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("hello")
    public String hello(){
        return "hello gradle";
    }

//    //获取学生信息
//    @GetMapping("/student")
//    public Result<StudentDo> getStudent() {
//        StudentDo studentDo = new StudentDo();
//        studentDo.setId(1);
//        studentDo.setAge(18);
//        studentDo.setName("XuWwei");
//        return new Result<>(ResultEnum.SUCCESS, studentDo);
//    }

    //自定义异常处理
    @RequestMapping("/getDeException")
    public Result<Object> DeException() {
        throw new RuntimeException();
    }

    //其他异常处理
    @RequestMapping("/getException")
    public Result Exception(){
        Result result = new Result();
        int a=1/0;
        return result;
    }

}
