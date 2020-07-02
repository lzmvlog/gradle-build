package com.example.demogradle.service.impl;

import cn.hutool.core.util.IdUtil;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demogradle.dao.StudentDao;
import com.example.demogradle.model.StudentDo;
import com.example.demogradle.model.dto.StudentDTO;
import com.example.demogradle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ShaoJie
 * @Date 2020年07月02 14:41
 * @Description:
 */
@Service
public class StudentServiceImpl implements StudentService {

    /**
     * student'dao
     */
    @Autowired
    private StudentDao studentDao;

    @Autowired
    private PaginationInterceptor paginationInterceptor;

    /**
     * insert student
     *
     * @param studentDTO student'dto
     */
    @Transactional
    public void insertStudent(StudentDTO studentDTO) {
        studentDao.insert(new StudentDo()
                .setId(IdUtil.fastSimpleUUID())
                .setName(studentDTO.getName())
                .setAge(studentDTO.getAge()));
    }

    /**
     * find student by studentDTO
     *
     * @param studentDTO student'dto
     * @return list student'list
     */
    public List<StudentDo> listStudents(StudentDTO studentDTO) {
        return studentDao.selectList(Wrappers.query(new StudentDo()
                .setId(studentDTO.getId())
                .setName(studentDTO.getName())
                .setAge(studentDTO.getAge())));
    }

    /**
     * find student by studentDTO
     *
     * @param page       page vo
     * @param studentDTO student'dto
     * @return list student'list
     */
    public IPage<StudentDo> listStudentsPage(Page<StudentDo> page, StudentDTO studentDTO) {
        return studentDao.selectPage(page, Wrappers.query(new StudentDo()
                .setId(studentDTO.getId())
                .setName(studentDTO.getName())
                .setAge(studentDTO.getAge())));
    }

}
