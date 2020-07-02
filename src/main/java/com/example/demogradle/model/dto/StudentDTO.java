package com.example.demogradle.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author ShaoJie
 * @Date 2020年07月02 14:43
 * @Description: student 数据传输对象
 */
@Data
public class StudentDTO{
    /**
     * 学生编号
     */
    @TableId("id")
    private String id;

    /**
     * 学生姓名
     */
    @TableField("name")
    private String name;

    /**
     * 学生年龄
     */
    @TableField("age")
    private Integer age;
}
