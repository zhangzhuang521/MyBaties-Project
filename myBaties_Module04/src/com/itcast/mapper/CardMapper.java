package com.itcast.mapper;

import com.itcast.domain.Card;

import java.util.List;

public interface CardMapper {
    public abstract List<Card> findAll();
}
