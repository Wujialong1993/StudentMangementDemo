package com.jwu.graduate.dao;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.jwu.graduate.domain.Student;

import java.util.List;

public interface StudentDao
{
    public int addStudent(Student student);

    public int deleteStudentById(int id);

    public int updateStudent(Student student);

    public Student getStudentById(int id);

    public int getStudentCount();

    public List<Student> getStudentListForPage(@Param("start") int start, @Param("count") int count);
}
