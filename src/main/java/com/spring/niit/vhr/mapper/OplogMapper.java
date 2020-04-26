package com.spring.niit.vhr.mapper;

import com.spring.niit.vhr.model.Oplog;

public interface OplogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Oplog record);

    int insertSelective(Oplog record);

    Oplog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Oplog record);

    int updateByPrimaryKey(Oplog record);
}