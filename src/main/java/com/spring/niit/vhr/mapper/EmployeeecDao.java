package com.spring.niit.vhr.mapper;

import com.spring.niit.vhr.model.Employeeec;

public interface EmployeeecDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}