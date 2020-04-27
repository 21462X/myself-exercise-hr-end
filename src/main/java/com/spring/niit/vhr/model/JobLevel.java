package com.spring.niit.vhr.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * jobLevel
 * @author 
 */
@Data
@ApiModel(value = "职称实体类", description = "职称信息描述")
public class JobLevel {
    @ApiModelProperty(value = "职称id")
    private Integer id;

    /**
     * 职称名称
     */
    @ApiModelProperty(value = "职称名称")
    private String name;

    private String titlelevel;

    @JsonFormat(pattern = "yyyy-MM-dd hh:hh", timezone = "Asia/Shanghai")
    @ApiModelProperty(value = "职位创建时间")
    private Date createdate;

    private Boolean enabled;

    private static final long serialVersionUID = 1L;
}