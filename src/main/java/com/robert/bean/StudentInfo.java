package com.robert.bean;

/**
 * Created by Administrator on 2016/10/7.
 */
public class StudentInfo {

    /** Ö÷¼ü */
    private String id;
    /** Ñ§ºÅ */
    private String student_no;
    /** ÐÕÃû */
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentInfo{" +
                "id='" + id + '\'' +
                ", student_no='" + student_no + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
