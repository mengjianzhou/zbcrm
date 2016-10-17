package com.robert.service;

import com.robert.mappers.TeacherInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/9.
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherInfoMapper teacherInfoMapper;

    @Override
    public String getTeacherInfoList() {
        return teacherInfoMapper.getTeacherInfoList();
    }
}
