package com.spring.niit.vhr.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * role
 * @author 
 */
@Data
@ApiModel(value = "角色实体类", description = "权限菜单角色的描述")
public class Role implements Serializable {
    private Integer id;

    private String name;

    /**
     * 角色名称
     */
    private String namezh;

    private static final long serialVersionUID = 1L;

}