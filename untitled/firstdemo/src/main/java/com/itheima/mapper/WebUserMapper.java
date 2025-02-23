package com.itheima.mapper;

import com.itheima.pojo.WebUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WebUserMapper {
    @Select("select * from webuser")
    public List<WebUser> list();
    @Delete("delete from webuser where id = #{id}")
    public Integer deleteById(Integer id);
    @Select("select * from webuser where id = #{id} and name = #{name}")
    WebUser login(WebUser webUser);
}
