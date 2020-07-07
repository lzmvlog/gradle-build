package com.example.demogradle.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demogradle.model.dto.StudentDTO;
import com.example.demogradle.service.impl.StudentServiceImpl;
import com.example.demogradle.util.Result;
import com.example.demogradle.util.ResultEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ShaoJie
 * @Date 2020年07月02 14:47
 * @Description:
 */
@RestController
@RequestMapping("stu")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    /**
     * insert student
     *
     * @param studentDTO student'dto
     * @return boolean success OR error
     */
    @PostMapping("insertStu")
    public Result insertStudent(StudentDTO studentDTO) {
        studentService.insertStudent(studentDTO);
        return new Result(ResultEnum.SUCCESS);
    }

    /**
     * select student by student'dto
     *
     * @param studentDTO student'dto
     * @return list student'list
     */
    @PostMapping("select")
    public Result listStudent(StudentDTO studentDTO) {
        return new Result(ResultEnum.SUCCESS, studentService.listStudents(studentDTO));
    }

    /**
     * select student by student'dto
     *
     * @param studentDTO student'dto
     * @param page       page
     * @return list student'list
     */
    @PostMapping("selectPage")
    public Result listStudentPage(StudentDTO studentDTO, com.example.demogradle.util.Page page) {
        return new Result(ResultEnum.SUCCESS, studentService.listStudentsPage(new Page<>(page.getPage(), page.getPageNum()), studentDTO));
    }

}
