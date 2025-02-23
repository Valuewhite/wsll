package com.itheima.dao.impl;

import com.itheima.dao.WebUserDao;
import com.itheima.pojo.WebUser;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WebUserDaoA implements WebUserDao {
    @Override
    public List<WebUser> listWebUser() {
        return null;
    }
}
