package com.itcast.manyToMany;

import com.itcast.domain.Subject;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SubjectMapper {
    @Select("select distinct su.id,su.num from subject su,st_su ss where su.id=ss.suid")
    @Results({
            @Result(column = "id",property ="id" ),
            @Result(column ="num" ,property ="num" ),
            @Result(
                    property = "students",
                    javaType = List.class,
                    column = "id",
                    many = @Many(select = "com.itcast.manyToMany.StudentMapper.findById")
            )
    })
    public abstract List<Subject> selectAll();
}
