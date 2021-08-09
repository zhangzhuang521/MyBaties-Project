package com.itcast.test;

import com.itcast.domain.*;
import com.itcast.manyToMany.SubjectMapper;
import com.itcast.oneToMany.ClassesMapper;
import com.itcast.oneToOne.CardMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestDemo01 {

    @Test
    public void test01(){
        SqlSession sqlSession = MapperUtils.getSqlSession();
        CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
        List<Card> cardList = cardMapper.selectAll();
        for (Card card : cardList) {
            System.out.println(card.getId()+" "+card.getNum());
            Person p = card.getP();
            System.out.println("\t"+p.getId()+" "+p.getAge()+" "+p.getName());
        }
    }
    @Test
    public void test02(){
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        List<Classes> classesList = classesMapper.selectAll();
        for (Classes classes : classesList) {
            System.out.println(classes.getId()+" "+classes.getNum());
            List<Student> studentList = classes.getStudents();
            for (Student student : studentList) {
                System.out.println("\t"+student.getId()+" "+student.getName()+" "+student.getAge());
            }
        }
    }
    @Test
    public void test03(){
        SqlSession sqlSession = MapperUtils.getSqlSession();
        SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
        List<Subject> subjectList = subjectMapper.selectAll();
        for (Subject subject : subjectList) {
            System.out.println(subject.getId()+" "+subject.getNum());
            List<Student> students = subject.getStudents();
            for (Student student : students) {
                System.out.println("\t"+student.getId()+" "+student.getName()+" "+student.getAge());
            }
        }

    }
}
