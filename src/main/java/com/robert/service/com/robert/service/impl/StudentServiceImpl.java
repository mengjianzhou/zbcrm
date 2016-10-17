package com.robert.service.com.robert.service.impl;

import com.robert.bean.StudentInfo;
import com.robert.mappers.StudentMapper;
import com.robert.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/10/7.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentInfo> getStudentInfo() {
        return studentMapper.getStudentInfo();
    }
}
