package com.itcast.ma;

import com.itcast.domian.Student;

import java.util.List;

//定义一个接口
public interface StudentMapper {
    //查询全部
    public abstract List<Student> findAll();

    //根据id查询
    public abstract Student findById(Integer id);

}
