package com.spring.niit.vhr.mapper;

import com.spring.niit.vhr.model.JobLevel;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface JobLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobLevel record);

    int insertSelective(JobLevel record);

    JobLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobLevel record);

    int updateByPrimaryKey(JobLevel record);


    @Select("select * from joblevel")
    List<JobLevel> selectAllJobLevel();

    //    @Delete({"<script> ",
//        "delete from joblevel where id in ",
//        "<foreach collection='array' item='item' open='('  separator=',' close=')'>",
//        "#{item}",
//        "</foreach>",
//        "</script>" })
    Integer deleteByIds(Integer[] ids);
}