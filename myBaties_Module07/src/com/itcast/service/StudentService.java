package com.itcast.service;

import com.itcast.domian.Student;

import java.util.List;

public interface StudentService {
    //查询全部
    public abstract List<Student> findAll();

    //根据id查询
    public abstract Student findById(Integer id);

}
