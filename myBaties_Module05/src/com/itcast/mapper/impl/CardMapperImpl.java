package com.itcast.mapper.impl;

import com.itcast.domain.Card;
import com.itcast.mapper.CardMapper;
import com.itcast.utils.MapperUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class CardMapperImpl implements CardMapper {
    @Override
    public List<Card> findAll() {
//        利用工具类来获取sqlSession对象
        SqlSession sqlSession = MapperUtils.getSqlSession();
//        获取代理接口对象
        CardMapper cardMapper = sqlSession.getMapper(CardMapper.class);
//        调用方法
        List<Card> cardList = cardMapper.findAll();
        return cardList;
    }
}
