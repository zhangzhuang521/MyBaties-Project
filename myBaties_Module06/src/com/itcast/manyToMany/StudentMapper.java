package com.itcast.manyToMany;

import com.itcast.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select s.id,s.name,s.age from student s,st_su ss where s.id=ss.stid and ss.`suid`=#{id}")
    public abstract List<Student> findById(Integer id);
}
