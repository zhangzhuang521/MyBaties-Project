package com.itcast.oneToMany;

import com.itcast.domain.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student where sid=#{sid}")
    public abstract List<Student> findById(Integer sid);
}
