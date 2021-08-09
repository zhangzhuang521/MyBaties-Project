package com.itcast.service;

import com.itcast.domian.Student;

import java.util.List;

public interface StudentService {
    //查询全部
    public abstract List<Student> findAll();

    //根据id查询
    public abstract Student findById(Integer id);

    //添加
    public abstract int insert(Student stu);

    //修改
    public abstract int update(Student stu);

    //删除
    public abstract int delete(Integer id);

    //多条件查询
    public abstract List<Student> findContion(Student stu);

    //多个id查询
    public abstract List<Student> findByIds(List<Integer> ids);
}
