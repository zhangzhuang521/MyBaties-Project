package com.itcast.mapper.impl;

import com.itcast.domain.Subject;
import com.itcast.mapper.SubjectMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SubjectMapperImpl implements SubjectMapper {
    @Override
    public List<Subject> findAll() {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
        List<Subject> subjectList = subjectMapper.findAll();
        return subjectList;
    }
}
