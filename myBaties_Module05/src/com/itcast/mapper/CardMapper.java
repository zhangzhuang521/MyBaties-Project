package com.itcast.mapper;

import com.itcast.domain.Card;

import java.util.List;

public interface CardMapper {
//    定义一个接口来获取所有的少的一方的实体的集合
    public abstract List<Card> findAll();
}
