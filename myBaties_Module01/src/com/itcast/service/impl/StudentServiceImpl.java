package com.itcast.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
             PageHelper.startPage(2,3);
            //执行sql语句
            studentList = studentMapper.findAll();
            PageInfo<Student> studentPageInfo = new PageInfo<>(studentList);
            System.out.println("总条数："+studentPageInfo.getTotal());
            System.out.println("总页数："+studentPageInfo.getPages());
            System.out.println("当前的页数："+studentPageInfo.getPageNum());
            System.out.println("当前的页的条数："+studentPageInfo.getPageSize());
            System.out.println("上一页的页数："+studentPageInfo.getPrePage());
            System.out.println("下一页的页数："+studentPageInfo.getNextPage());
            System.out.println("是否是第一页："+studentPageInfo.isIsFirstPage());
            System.out.println("是否是最后一页："+studentPageInfo.isIsLastPage());
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

    @Override
    public int insert(Student stu) {
        int result = 0;
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
            result = studentMapper.insert(stu);
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
        return result;
    }

    @Override
    public int update(Student stu) {
        int result = 0;
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
            result = studentMapper.update(stu);
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
        return result;
    }

    @Override
    public int delete(Integer id) {
        int result = 0;
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
            result = studentMapper.delete(id);
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
        return result;
    }

    @Override
    public List<Student> findContion(Student stu) {
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
            studentList = studentMapper.findContion(stu);
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
    public List<Student> findByIds(List<Integer> ids) {
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
            studentList = studentMapper.findByIds(ids);
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
}
