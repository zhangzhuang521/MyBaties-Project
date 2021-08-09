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
        Student student = studentService.findById(3);
        System.out.println(student);
    }
    
}
