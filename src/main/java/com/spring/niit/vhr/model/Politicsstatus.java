package com.spring.niit.vhr.model;

import java.io.Serializable;

/**
 * politicsstatus
 * @author 
 */
public class Politicsstatus implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}