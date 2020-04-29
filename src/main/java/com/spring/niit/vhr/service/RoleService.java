package com.spring.niit.vhr.service;

import com.spring.niit.vhr.mapper.RoleMapper;
import com.spring.niit.vhr.model.Menu;
import com.spring.niit.vhr.model.Role;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class RoleService {
    @Resource
    RoleMapper roleMapper;

    public List<Role> getAllRoles() {
        return roleMapper.getAllRoles();
    }

    public List<Menu> getAllMenus() {
        return roleMapper.getAllMenus();
    }
}