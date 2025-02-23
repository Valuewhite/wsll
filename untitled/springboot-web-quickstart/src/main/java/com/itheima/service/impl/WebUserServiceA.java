package com.itheima.service.impl;

import com.itheima.dao.WebUserDao;
import com.itheima.dao.impl.WebUserDaoA;
import com.itheima.pojo.WebUser;
import com.itheima.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WebUserServiceA implements WebUserService {
    @Autowired
    private WebUserDao webUserDao;
    @Override
    public List<WebUser> listWebUser() {
        return webUserDao.listWebUser();
    }
}
