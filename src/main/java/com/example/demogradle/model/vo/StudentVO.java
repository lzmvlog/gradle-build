package com.example.demogradle.model.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ShaoJie
 * @Date 2020年07月02 14:41
 * @Description: student 数据展示对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class StudentVO {
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
