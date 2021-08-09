package com.itcast.mapper.impl;

import com.itcast.domain.Card;
import com.itcast.domain.Classes;
import com.itcast.mapper.CardMapper;
import com.itcast.mapper.ClassesMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ClassesMapperImpl implements ClassesMapper {
    @Override
    public List<Classes> findAll() {
//        利用工具类来获取sqlSession对象
        SqlSession sqlSession = MapperUtils.getSqlSession();
//        获取代理接口对象
        ClassesMapper classesMapper = sqlSession.getMapper(ClassesMapper.class);
//        调用方法
        List<Classes> classesList = classesMapper.findAll();
        return classesList;
    }
}
