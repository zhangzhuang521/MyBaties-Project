package com.itcast.domain;

import java.util.List;

public class Subject {
    private Integer id;
    private String num;

    private List<Student> students;

    public Subject() {
    }

    public Subject(Integer id, String num, List<Student> students) {
        this.id = id;
        this.num = num;
        this.students = students;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", num='" + num + '\'' +
                ", students=" + students +
                '}';
    }
}
