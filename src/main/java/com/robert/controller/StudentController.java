package com.robert.controller;

import com.robert.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2016/10/7.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getAllStudentInfo")
    public void getAllStudentInfo(){
        studentService.getStudentInfo();
    }

}
