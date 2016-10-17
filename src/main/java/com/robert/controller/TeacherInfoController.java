package com.robert.controller;

import com.robert.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/10/9.
 */
public class TeacherInfoController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("getTeacherInfo")
    @ResponseBody
    public String getTeacherInfo(){
        return teacherService.getTeacherInfoList();
    }
}
