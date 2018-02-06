package com.jwu.graduate.domain;

import java.sql.Timestamp;

public class Student
{
    private int studentId;

    private String studentName;

    private String studentGender;

    private int studentAge;

    private int studentGrade;

    private double studentChinese;

    private double studentMath;

    private double studentSport;

    private Timestamp studentUpdateTime;

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public String getStudentGender()
    {
        return studentGender;
    }

    public void setStudentGender(String studentGender)
    {
        this.studentGender = studentGender;
    }

    public int getStudentAge()
    {
        return studentAge;
    }

    public void setStudentAge(int studentAge)
    {
        this.studentAge = studentAge;
    }

    public int getStudentGrade()
    {
        return studentGrade;
    }

    public void setStudentGrade(int studentGrade)
    {
        this.studentGrade = studentGrade;
    }

    public double getStudentChinese()
    {
        return studentChinese;
    }

    public void setStudentChinese(double studentChinese)
    {
        this.studentChinese = studentChinese;
    }

    public double getStudentMath()
    {
        return studentMath;
    }

    public void setStudentMath(double studentMath)
    {
        this.studentMath = studentMath;
    }

    public double getStudentSport()
    {
        return studentSport;
    }

    public void setStudentSport(double studentSport)
    {
        this.studentSport = studentSport;
    }

    public Timestamp getStudentUpdateTime()
    {
        return studentUpdateTime;
    }

    public void setStudentUpdateTime(Timestamp studentUpdateTime)
    {
        this.studentUpdateTime = studentUpdateTime;
    }
}
