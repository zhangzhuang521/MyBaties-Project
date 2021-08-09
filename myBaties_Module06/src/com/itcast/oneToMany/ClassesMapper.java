package com.itcast.oneToMany;

import com.itcast.domain.Classes;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ClassesMapper {
    @Select("select * from classes")
    @Results({
            @Result(column = "id",property ="id" ),
            @Result(column = "num",property ="num" ),
            @Result(
                    property = "students",
                    javaType =List.class,
                    column = "id",
                    many = @Many(select = "com.itcast.oneToMany.StudentMapper.findById")
            )
    })
    public abstract List<Classes> selectAll();
}
