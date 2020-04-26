package com.spring.niit.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * position
 * @author 
 */
@Data
public class Position {
    private Integer id;

    /**
     * 职位
     */
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd hh:hh",timezone = "Asia/Shanghai")
    private Date createdate;

    private Boolean enabled;
}