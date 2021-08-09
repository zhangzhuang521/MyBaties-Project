package com.itcast.oneToOne;

import com.itcast.domain.Person;
import org.apache.ibatis.annotations.Select;

public interface PersonMapper {
    @Select("select * from person where cid=#{cid}")
    public abstract Person findById(Integer cid);
}
