package com.itheima.Controller;

import com.itheima.domian.Student;
import com.itheima.service.StudentService;
import com.itheima.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ControllerTest {
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
        Student student = studentService.findById(5);
        System.out.println(student);
    }

    @Test
    public void insertTest() {
        Student xiaojiu= new Student(9, "xiaojiu", 19);
        int result = studentService.insert(xiaojiu);
        if(result>0){
            System.out.println("添加成功");
        }else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void updateTest() {
        Student xiaojiu= new Student(9, "xiaojiujiu", 19);
        int result = studentService.update(xiaojiu);
        if(result>0){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void deleteTest() {
        int result = studentService.delete(9);
        if(result>0){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }

    @Test
    public void findContionTest() {
        Student xiaojiu= new Student(null, "xiaowu",null);
        List<Student> studentList = studentService.findContion(xiaojiu);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void findByIdsTest() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        List<Student> studentList = studentService.findByIds(arrayList);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
