package com.itcast.test;

import com.itcast.domain.*;
import com.itcast.mapper.CardMapper;
import com.itcast.mapper.ClassesMapper;
import com.itcast.mapper.SubjectMapper;
import com.itcast.mapper.impl.CardMapperImpl;
import com.itcast.mapper.impl.ClassesMapperImpl;
import com.itcast.mapper.impl.SubjectMapperImpl;
import org.junit.Test;

import java.util.List;

public class TestDemo01 {
    private CardMapper cardMapper = new CardMapperImpl();

    private ClassesMapper classesMapper = new ClassesMapperImpl();

    private SubjectMapper subjectMapper =new SubjectMapperImpl();
    @Test
    public void test01() {
        List<Card> cardList = cardMapper.findAll();
        for (Card card : cardList) {
            System.out.println(card.getId() + " " + card.getNum());
            Person p = card.getP();
            System.out.println("\t" + p.getId() + " " + p.getName() + " " + p.getAge());
        }
    }

    @Test
    public void test02() {
        List<Classes> classesList = classesMapper.findAll();
        for (Classes classes : classesList) {
            System.out.println(classes.getId()+" "+classes.getNum());
            List<Student> studentList = classes.getStudents();
            for (Student student : studentList) {
                System.out.println("\t"+student.getId()+" "+student.getName()+" "+student.getAge());
            }
        }
    }
    @Test
    public void test03() {
        List<Subject> subjectList = subjectMapper.findAll();
//        System.out.println(subjectList);
        for (Subject subject : subjectList) {
            System.out.println(subject.getId()+" "+subject.getNum());
            List<Student> students = subject.getStudents();
            for (Student student : students) {
                System.out.println("\t"+student.getId()+" "+student.getName()+" "+student.getAge());
            }
        }
    }
}

