package com.itcast.service.impl;

import com.itcast.domian.Student;
import com.itcast.ma.StudentMapper;
import com.itcast.service.StudentService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        List<Student> studentList = null;
        InputStream resource = null;
        SqlSession sqlSession = null;
        try {
            //加载核心配置文件
            resource = Resources.getResourceAsStream("SqlSessionConfig.xml");
            //获取sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
            //获取sqlSession对象，参数为true则是开启自动提交事务
            sqlSession = sqlSessionFactory.openSession(true);
            //获取执行sql语句的动态代理对象
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            //执行sql语句
            studentList = studentMapper.findAll();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (resource != null) {
                try {
                    resource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return studentList;
    }

    @Override
    public Student findById(Integer id) {
        Student student = null;
        InputStream resource = null;
        SqlSession sqlSession = null;
        try {
            //加载核心配置文件
            resource = Resources.getResourceAsStream("SqlSessionConfig.xml");
            //获取sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
            //获取sqlSession对象，参数为true则是开启自动提交事务
            sqlSession = sqlSessionFactory.openSession(true);
            //获取执行sql语句的动态代理对象
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            //执行sql语句
            student = studentMapper.findById(id);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (resource != null) {
                try {
                    resource.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return student;
    }

}
