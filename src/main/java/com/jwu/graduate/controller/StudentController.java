package com.jwu.graduate.controller;

import com.jwu.graduate.domain.Student;
import com.jwu.graduate.service.StudentService;
import com.jwu.graduate.util.DataTools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    public StudentService service;

    @RequestMapping("/page/detail")
    public ModelAndView getDetailPage()
    {
    	System.out.println("=============/page/detail============");
        return new ModelAndView("detail");
    }
    
    
    @RequestMapping("/page/detail-copy")
    public ModelAndView getDetailPage33(@RequestParam(value="username") String name)
    {
    	System.out.println("=======================/page/detail-copy?username="+name);
        return new ModelAndView("detail");
    }
    
    @RequestMapping("/page/detail/{ok}")
    @ResponseBody
    public Map<String, Object> getDetailPage1(@PathVariable("ok") String name)
    {
    	/*Student stu=new Student();
    	stu.setStudentAge(11);
    	stu.setStudentId(11111);
    	stu.setStudentName("wjl");
    	return stu;*/
    	
    	return service.getPageData();
    }
    
    @RequestMapping("/page/detail/getone")
    @ResponseBody
    public Map<String, Object> getDetailGetOne(int id)
    {
    	System.out.println("=======================/page/detail/getone?id="+id);
        return service.getOneData(1);
    }
    
    @RequestMapping("/page/detail/insertone")
    @ResponseBody
    public Map<String, Object> getDetailInsertOne()
    {
    	System.out.println("=======================/page/detail/insertone");
    	Map<String,String> params=new HashMap<String,String>();
    	params.put("studentName", "gjw");
    	params.put("studentGender", "nan");
    	params.put("studentAge", "25");
    	params.put("studentGrade", "0");
    	params.put("studentChinese", "12");
    	params.put("studentMath", "11");
    	params.put("studentSport", "1");
        return service.getAddData(params);
    }
    
    

    @RequestMapping("/data/detail")
    @ResponseBody
    public Map<String, Object> getDetailData(@RequestBody Map<String, String> params)
    {
        StringBuilder message = new StringBuilder();

        if(params == null)
        {
            message.append("请求参数为空！");
        }
        else if(StringUtils.isEmpty(params.get("start")))
        {
            message.append("起始位置为空！");
        }
        else if(DataTools.isPositiveInteger(params.get("start")) == false)
        {
            message.append("起始位置不是正整数！");
        }
        else if(StringUtils.isEmpty(params.get("count")))
        {
            message.append("数据数量为空！");
        }
        else if(DataTools.isPositiveInteger(params.get("count")) == false)
        {
            message.append("数据数量不是正整数！");
        }

        if(StringUtils.isEmpty(message.toString()))
        {
            return service.getDetailData(params);
        }
        else
        {
            Map<String, Object> result = new HashMap<String, Object>();

            result.put("message", message.toString());

            return result;
        }
    }

    @RequestMapping("/data/page")
    @ResponseBody
    public Map<String, Object> getPageData()
    {
        return service.getPageData();
    }

    @RequestMapping("/data/add")
    @ResponseBody
    public Map<String, Object> getAddData(@RequestBody Map<String, String> params)
    {
        StringBuilder message = new StringBuilder();

        if(params == null)
        {
            message.append("请求参数为空！");
        }
        else if(params.size() != 8)
        {
            message.append("参数数量错误！");
        }
        else if(StringUtils.isEmpty(params.get("studentName")))
        {
            message.append("学生姓名不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentGender")))
        {
            message.append("学生性别不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentAge")))
        {
            message.append("学生年龄不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentGrade")))
        {
            message.append("学生年级不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentChinese")))
        {
            message.append("学生语文成绩不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentMath")))
        {
            message.append("学生数学成绩不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentSport")))
        {
            message.append("学生体育成绩不能为空！");
        }
        else if(("男".equals(params.get("studentGender")) == false)&&("女".equals(params.get("studentGender")) == false))
        {
            message.append("学生性别只能为男或女！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentAge")) == false)
        {
            message.append("学生年龄只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentGrade")) == false)
        {
            message.append("学生年级只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentChinese")) == false)
        {
            message.append("学生语文成绩只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentMath")) == false)
        {
            message.append("学生数学成绩只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentSport")) == false)
        {
            message.append("学生体育成绩只能为正整数！");
        }

        if(StringUtils.isEmpty(message.toString()))
        {
            return service.getAddData(params);
        }
        else
        {
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("message", message.toString());
            return result;
        }
    }

    @RequestMapping("/data/delete")
    @ResponseBody
    public Map<String, Object> getDeleteData(@RequestBody Map<String, String> params)
    {
        StringBuilder message = new StringBuilder();

        if(params == null)
        {
            message.append("请求参数为空！");
        }
        else if(params.size() != 1)
        {
            message.append("参数数量错误！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentId")) == false)
        {
            message.append("参数类型错误！");
        }

        if(StringUtils.isEmpty(message.toString()))
        {
            return service.getDeleteData(params);
        }
        else
        {
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("message", message.toString());
            return result;
        }
    }

    @RequestMapping("/data/update")
    @ResponseBody
    public Map<String, Object> getUpdateData(@RequestBody Map<String, String> params)
    {
        StringBuilder message = new StringBuilder();

        if(params == null)
        {
            message.append("请求参数为空！");
        }
        else if(params.size() != 8)
        {
            message.append("参数数量错误！");
        }
        else if(StringUtils.isEmpty(params.get("studentId")))
        {
            message.append("学生ID不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentName")))
        {
            message.append("学生姓名不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentGender")))
        {
            message.append("学生性别不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentAge")))
        {
            message.append("学生年龄不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentGrade")))
        {
            message.append("学生年级不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentChinese")))
        {
            message.append("学生语文成绩不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentMath")))
        {
            message.append("学生数学成绩不能为空！");
        }
        else if(StringUtils.isEmpty(params.get("studentSport")))
        {
            message.append("学生体育成绩不能为空！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentId")) == false)
        {
            message.append("学生ID只能为正整数！");
        }
        else if(("男".equals(params.get("studentGender")) == false)&&("女".equals(params.get("studentGender")) == false))
        {
            message.append("学生性别只能为男或女！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentAge")) == false)
        {
            message.append("学生年龄只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentGrade")) == false)
        {
            message.append("学生年级只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentChinese")) == false)
        {
            message.append("学生语文成绩只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentMath")) == false)
        {
            message.append("学生数学成绩只能为正整数！");
        }
        else if(DataTools.isPositiveInteger(params.get("studentSport")) == false)
        {
            message.append("学生体育成绩只能为正整数！");
        }

        if(StringUtils.isEmpty(message.toString()))
        {
            return service.getUpdateData(params);
        }
        else
        {
            Map<String, Object> result = new HashMap<String, Object>();
            result.put("message", message.toString());
            return result;
        }
    }
}
