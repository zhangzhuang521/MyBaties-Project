package com.itheima.utils;

import com.itheima.mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MapperUtils {
    //私有构造方法
    private MapperUtils() {
    }

    //私有变量
    private static InputStream inputStream;
    private static SqlSession sqlSession;

    //静态代码块
    static {
        try {
            //加载核心配置文件：MyBaties-config.xml
            inputStream = Resources.getResourceAsStream("MyBaties-config.xml");
            //获取sqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //获取sqlSession对象 参数true 表示开启自动提交事务
            sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //定义一个方法获取studentMapper
    public static StudentMapper getStudentMapper() {
        return sqlSession.getMapper(StudentMapper.class);
    }

    //释放资源
    public static void close() {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
