package com.itcast.mapper.impl;

import com.itcast.domain.Classes;
import com.itcast.mapper.ClassesMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClassesMapperImpl implements ClassesMapper {
    @Override
    public List<Classes> findAll() {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
        List<Classes> classesList = classesMapper.findAll();
        return classesList;
    }
}
