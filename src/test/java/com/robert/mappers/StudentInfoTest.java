package com.robert.mappers;

import com.robert.bean.StudentInfo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2016/10/9.
 */
public class StudentInfoTest {

    private ApplicationContext applicationContext;
    private StudentMapper studentMapper;

    @Before
    public void setup(){
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        studentMapper = (StudentMapper) applicationContext.getBean("studentMapper");
    }

    @Test
    public void testQueryStudentInfoList(){

        List<StudentInfo> studentInfoList = studentMapper.getStudentInfo();
        System.out.println(studentInfoList);
    }

}
