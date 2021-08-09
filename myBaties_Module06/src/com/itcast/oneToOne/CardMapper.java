package com.itcast.oneToOne;

import com.itcast.domain.Card;
import com.itcast.domain.Person;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface CardMapper {
    @Select("select * from card")
    @Results(
            {
             @Result(column = "id", property = "id"),
             @Result(column = "num", property = "num"),
             @Result(
                     property = "p",
                     javaType = Person.class,
                     column = "id",
                     one = @One(select = "com.itcast.oneToOne.PersonMapper.findById")
                    )
            }
    )
    public abstract List<Card> selectAll();
}
