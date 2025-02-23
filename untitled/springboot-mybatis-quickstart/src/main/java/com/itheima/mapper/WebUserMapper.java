package com.itheima.mapper;

import com.itheima.pojo.WebUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WebUserMapper {
    @Select("select * from webuser")
    public List<WebUser> LIST();
}
