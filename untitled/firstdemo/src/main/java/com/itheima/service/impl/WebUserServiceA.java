package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.WebUserMapper;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.WebUser;
import com.itheima.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WebUserServiceA implements WebUserService {
    @Autowired
    private WebUserMapper webUserMapper;
    @Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRES_NEW)
    @Override
    public List<WebUser> list() {
        List<WebUser> webUsers = webUserMapper.list();
        return webUsers;
    }

    @Override
    public Integer deleteById(Integer id) {
        Integer flag = webUserMapper.deleteById(id);
        return flag;
    }

    @Override
    public PageBean page(Integer start, Integer pageSize) {
        PageHelper.startPage(start, pageSize);
        List<WebUser> webUserList = webUserMapper.list();
        Page<WebUser> p = (Page<WebUser>) webUserList;
        PageBean pageBean = new PageBean((int) p.getTotal(), p.getResult());
        return pageBean;
    }

    @Override
    public WebUser login(WebUser webUser) {

        return webUserMapper.login(webUser);
    }
}
