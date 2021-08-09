package com.itcast.controller;

import com.itcast.domian.Student;
import com.itcast.service.StudentService;
import com.itcast.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private StudentService studentService = new StudentServiceImpl();

    @Test
    public void findAllTest() {
        List<Student> studentList = studentService.findAll();
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void findByIdTest() {
        Student student = studentService.findById(8);
        System.out.println(student);
    }

    @Test
    public void insertTest() {
//        Student student = new Student(7, "xiaoqi", 17);
        Student student = new Student(9, "xiaoba", 18);
        int result = studentService.insert(student);
        System.out.println(result);

    }

    @Test
    public void updateTest() {
        Student student = new Student(9, "xiaojiu", 19);
        int result = studentService.update(student);
        System.out.println(result);
    }

    @Test
    public void deleteTest() {
        int result = studentService.delete(9);
        System.out.println(result);
    }

    @Test
    public void findContionTest() {
        Student stu = new Student(null, "xiaoyi", null);
        List<Student> studentList = studentService.findContion(stu);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void findByIdsTest() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(5);
        List<Student> studentList = studentService.findByIds(integerList);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
