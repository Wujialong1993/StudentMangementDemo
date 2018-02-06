package com.jwu.graduate.dao;

import com.jwu.graduate.dao.StudentDao;
import com.jwu.graduate.domain.Student;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring-dao.xml")
public class TestStudentDao
{
    @Autowired
    public StudentDao dao;

    @Test
    public void test()
    {
        Student student = getStudent();

        Assert.assertEquals(1, dao.addStudent(student));

        Student result = dao.getStudentById(student.getStudentId());

        Assert.assertTrue(checkStudent(student, result));

        updateStudent(student);

        Assert.assertEquals(1, dao.updateStudent(student));

        Assert.assertTrue(checkStudent(student, dao.getStudentById(student.getStudentId())));

        Assert.assertEquals(1, dao.deleteStudentById(student.getStudentId()));

        Assert.assertNull(dao.getStudentById(student.getStudentId()));
    }

    @Test
    public void testForPage()
    {
        Assert.assertEquals(0, dao.getStudentCount());

        Student student1 = getStudent();
        Student student2 = getStudent();
        Student student3 = getStudent();

        student1.setStudentAge(1);
        student2.setStudentAge(2);
        student3.setStudentAge(3);

        Assert.assertEquals(1, dao.addStudent(student1));
        Assert.assertEquals(1, dao.addStudent(student2));
        Assert.assertEquals(1, dao.addStudent(student3));

        Assert.assertEquals(3, dao.getStudentCount());

        List<Student> list1 = dao.getStudentListForPage(0, 3);
        List<Student> list2 = dao.getStudentListForPage(1, 1);
        List<Student> list3 = dao.getStudentListForPage(0, 4);

        Assert.assertEquals(3, list1.size());
        Assert.assertEquals(1, list2.size());
        Assert.assertEquals(3, list3.size());

        Assert.assertTrue(checkStudent(student1, list1.get(0)));
        Assert.assertTrue(checkStudent(student2, list1.get(1)));
        Assert.assertTrue(checkStudent(student3, list1.get(2)));
        Assert.assertTrue(checkStudent(student2, list2.get(0)));
        Assert.assertTrue(checkStudent(student1, list3.get(0)));
        Assert.assertTrue(checkStudent(student2, list3.get(1)));
        Assert.assertTrue(checkStudent(student3, list3.get(2)));

        Assert.assertEquals(1, dao.deleteStudentById(student1.getStudentId()));
        Assert.assertEquals(1, dao.deleteStudentById(student2.getStudentId()));
        Assert.assertEquals(1, dao.deleteStudentById(student3.getStudentId()));
    }

    public Student getStudent()
    {
        Student student = new Student();

        student.setStudentName("王明");
        student.setStudentGender("男");
        student.setStudentAge(10);
        student.setStudentGrade(5);
        student.setStudentChinese(90);
        student.setStudentMath(80);
        student.setStudentSport(90);

        return student;
    }

    public void updateStudent(Student student)
    {
        student.setStudentName("王莉");
        student.setStudentGender("女");
        student.setStudentAge(20);
        student.setStudentGrade(8);
        student.setStudentChinese(10);
        student.setStudentMath(20);
        student.setStudentSport(20);
    }

    public boolean checkStudent(Student m, Student n)
    {
        if(m == null)
        {
            return false;
        }
        if(n == null)
        {
            return false;
        }
        if(m.getStudentId() != n.getStudentId())
        {
            return false;
        }
        if(m.getStudentAge() != n.getStudentAge())
        {
            return false;
        }
        if(m.getStudentChinese() != n.getStudentChinese())
        {
            return false;
        }
        if(m.getStudentMath() != n.getStudentMath())
        {
            return false;
        }
        if(m.getStudentSport() != n.getStudentSport())
        {
            return false;
        }
        if(m.getStudentGrade() != n.getStudentGrade())
        {
            return false;
        }
        if(m.getStudentGender().equals(n.getStudentGender()) == false)
        {
            return false;
        }
        if(m.getStudentName().equals(n.getStudentName()) == false)
        {
            return false;
        }

        return true;
    }
}
