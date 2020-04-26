package com.spring.niit.vhr.service;

import com.spring.niit.vhr.mapper.MenuMapper;
import com.spring.niit.vhr.model.Hr;
import com.spring.niit.vhr.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuMapper menuMapper;
    //报红是因为@Autowired织入的问题有警告，可以通过开发环境的配置或@Resource

    public List<Menu> getMenusByHrId() {
        return menuMapper.getMenusByHrId(((Hr) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getId());

    }
}
