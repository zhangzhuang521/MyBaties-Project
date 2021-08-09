package com.itcast.mapper.impl;

import com.itcast.mapper.CardMapper;
import com.itcast.domain.Card;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CardMapperImpl implements CardMapper {
    @Override
    public List<Card> findAll() {
        SqlSession sqlSession = MapperUtils.getSqlSession();
        CardMapper sessionMapper = sqlSession.getMapper(CardMapper.class);
        List<Card> cardList = sessionMapper.findAll();
        return cardList;
    }
}
