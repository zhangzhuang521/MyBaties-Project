package com.itcast.mapper.impl;

import com.itcast.domain.Classes;
import com.itcast.domain.Subject;
import com.itcast.mapper.ClassesMapper;
import com.itcast.mapper.SubjectMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SubjectMapperImpl implements SubjectMapper {
    @Override
    public List<Subject> findAll() {
        //        利用工具类来获取sqlSession对象
        SqlSession sqlSession = MapperUtils.getSqlSession();
//        获取代理接口对象
        SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
//        调用方法
        List<Subject> subjectList = subjectMapper.findAll();
        return subjectList;
    }
}
