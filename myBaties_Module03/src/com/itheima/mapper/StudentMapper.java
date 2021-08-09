package com.itheima.mapper;

import com.itheima.domian.Student;
import com.itheima.sql.SqlTest;
import org.apache.ibatis.annotations.*;

import java.lang.reflect.Type;
import java.util.List;

public interface StudentMapper {
    //查询全部
//    @Select("SELECT  * FROM student")
    @SelectProvider(type= SqlTest.class,method = "getFindAll")
    public abstract List<Student> findAll();

    //根据id查询
//    @Select("SELECT  * FROM student WHERE id=#{id}")
    @SelectProvider(type= SqlTest.class,method = "getFindById")
    public abstract Student findById(Integer id);

    //添加
//    @Insert("insert into student values (#{id},#{name},#{age})")
    @InsertProvider(type= SqlTest.class,method = "getInsert")
    public abstract int insert(Student stu);

    //修改
//    @Update(" update student set name=#{name},age=#{age} where id=#{id}")
    @UpdateProvider(type= SqlTest.class,method = "getUpdate")
    public abstract int update(Student stu);

    //删除
//    @Delete("delete from student where id=#{id}")
    @DeleteProvider(type= SqlTest.class,method = "getDelete")
    public abstract int delete(Integer id);

    //多条件查询
    public abstract List<Student> findContion(Student stu);

    //多个id查询
//    @Select("SELECT  * FROM student WHERE id IN (1,3,5,7)")
    @SelectProvider(type= SqlTest.class,method = "getFindByIds")
    public abstract List<Student> findByIds(List<Integer> ids);
}
