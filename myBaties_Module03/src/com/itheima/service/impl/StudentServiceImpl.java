package com.itheima.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itheima.domian.Student;
import com.itheima.mapper.StudentMapper;
import com.itheima.service.StudentService;
import com.itheima.utils.MapperUtils;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
//        使用分页插件
        PageHelper.startPage(2,4);
        //执行sql语句
        List<Student> studentList = studentMapper.findAll();
        PageInfo<Student> pageInfo = new PageInfo<>(studentList);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.isIsFirstPage());
        MapperUtils.close();
        return studentList;
    }

    @Override
    public Student findById(Integer id) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        Student student = studentMapper.findById(id);
        MapperUtils.close();
        return student;
    }

    @Override
    public int insert(Student stu) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        int result = studentMapper.insert(stu);
        MapperUtils.close();
        return result;
    }

    @Override
    public int update(Student stu) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        int result = studentMapper.update(stu);
        MapperUtils.close();
        return result;
    }

    @Override
    public int delete(Integer id) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        int result = studentMapper.delete(id);
        MapperUtils.close();
        return result;
    }

    @Override
    public List<Student> findContion(Student stu) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        List<Student> studentList = studentMapper.findContion(stu);
        MapperUtils.close();
        return studentList;
    }

    @Override
    public List<Student> findByIds(List<Integer> ids) {
        //获取接口代理对象
        StudentMapper studentMapper = MapperUtils.getStudentMapper();
        //执行sql语句
        List<Student> studentList = studentMapper.findByIds(ids);
        MapperUtils.close();
        return studentList;
    }
}
