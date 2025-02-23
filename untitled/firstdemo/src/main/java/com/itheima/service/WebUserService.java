package com.itheima.service;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.WebUser;

import java.util.List;


public interface WebUserService {
    List<WebUser> list();

    Integer deleteById(Integer id);

    PageBean page(Integer start, Integer pageSize);

    WebUser login(WebUser webUser);
}
