package com.example.demogradle.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ShaoJie
 * @Date 2020年07月02 11:38
 * @Description: student
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@TableName(value = "student")
public class StudentDo {

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
