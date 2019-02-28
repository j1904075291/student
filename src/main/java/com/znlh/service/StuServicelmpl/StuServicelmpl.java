package com.znlh.service.StuServicelmpl;

import com.znlh.entity.Student;
import com.znlh.mapper.StudentMapper;
import com.znlh.service.StuService;

public class StuServicelmpl implements StuService {
    StudentMapper studentMapper;
    @Override
    public Student select(int id) {
        Student stu = studentMapper.selectByPrimaryKey(id);
        return stu;
    }
}
