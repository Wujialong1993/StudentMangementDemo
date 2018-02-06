package com.jwu.graduate.service;

import com.jwu.graduate.dao.StudentDao;
import com.jwu.graduate.domain.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService
{
	@Autowired
    public StudentDao dao;

    public Map<String, Object> getDetailData(Map<String, String> params)
    {
        int start = Integer.valueOf(params.get("start"));
        int count = Integer.valueOf(params.get("count"));

        List<Student> studentList = dao.getStudentListForPage(start, count);

        Map<String, Object> result = new HashMap<String, Object>();

        result.put("data", studentList);
        result.put("message", "success");

        return result;
    }

    public Map<String, Object> getPageData()
    {
        Map<String, Object> result = new HashMap<String, Object>();

        int count = dao.getStudentCount();

        result.put("data", count);
        result.put("message", "success");

        return result;
    }
    
    public Map<String, Object> getOneData(int id)
    {

    	Map<String, Object> result = new HashMap<String, Object>();
        Student stu = dao.getStudentById(id);

        result.put("data", stu);
        result.put("message", "success");

        return result;
    }

    public Map<String, Object> getAddData(Map<String, String> params)
    {
        Map<String, Object> result = new HashMap<String, Object>();

        if(StringUtils.isEmpty(params.get("studentId")) == false)
        {
            result.put("message", "重复添加！");

            return result;
        }

        Student student = new Student();

        student.setStudentName(params.get("studentName"));
        student.setStudentGender(params.get("studentGender"));
        student.setStudentAge(Integer.valueOf(params.get("studentAge")));
        student.setStudentGrade(Integer.valueOf(params.get("studentGrade")));
        student.setStudentChinese(Integer.valueOf(params.get("studentChinese")));
        student.setStudentMath(Integer.valueOf(params.get("studentMath")));
        student.setStudentSport(Integer.valueOf(params.get("studentSport")));

        int addResult = dao.addStudent(student);

        if(addResult == 1)
        {
            result.put("message", "添加成功！");
        }
        else
        {
            result.put("message", "添加失败！");
        }

        return result;
    }

    public Map<String, Object> getDeleteData(Map<String, String> params)
    {
        int studentId = Integer.valueOf(params.get("studentId"));

        int deleteResult = dao.deleteStudentById(studentId);

        Map<String, Object> result = new HashMap<String, Object>();

        if(deleteResult == 1)
        {
            result.put("message", "删除成功!");
        }
        else
        {
            result.put("message", "删除失败!");
        }

        return result;
    }

    public Map<String, Object> getUpdateData(Map<String, String> params)
    {
        Student student = new Student();

        student.setStudentId(Integer.valueOf(params.get("studentId")));
        student.setStudentName(params.get("studentName"));
        student.setStudentGender(params.get("studentGender"));
        student.setStudentAge(Integer.valueOf(params.get("studentAge")));
        student.setStudentGrade(Integer.valueOf(params.get("studentGrade")));
        student.setStudentChinese(Integer.valueOf(params.get("studentChinese")));
        student.setStudentMath(Integer.valueOf(params.get("studentMath")));
        student.setStudentSport(Integer.valueOf(params.get("studentSport")));

        int updateResult = dao.updateStudent(student);

        Map<String, Object> result = new HashMap<String, Object>();

        if(updateResult == 1)
        {
            result.put("message", "更新成功！");
        }
        else
        {
            result.put("message", "更新失败！");
        }

        return result;
    }
}
