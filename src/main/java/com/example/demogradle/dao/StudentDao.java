package com.example.demogradle.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demogradle.model.StudentDo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ShaoJie
 * @Date 2020年07月02 14:39
 * @Description:
 */
@Mapper
public interface StudentDao extends BaseMapper<StudentDo> {
}
