package com.spring.niit.vhr.mapper;

import com.spring.niit.vhr.model.Msgcontent;

public interface MsgcontentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Msgcontent record);

    int insertSelective(Msgcontent record);

    Msgcontent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Msgcontent record);

    int updateByPrimaryKey(Msgcontent record);
}