package com.itheima.mapper;

import com.itheima.pojo.WebUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WebUserMapper {
    @Delete("delete from webuser where id = #{id}")
    public void delete(Integer id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into webuser(name, age, gender, phone) value (#{name}, #{age}, #{gender}, #{phone})")
    public void insert(WebUser webUser);

    @Update("update webuser set name = #{name}, age = #{age}, gender = #{gender}, phone = #{gender} where id = #{id}")
    public void update(WebUser webUser);
    public void update2(WebUser webUser);

    @Select("select * from webuser where id = #{id}")
    public WebUser select(Integer id);

    //    @Select("select * from webuser where name like '%${name}%'")
//    public List<WebUser> listWebUser(String name);
//    @Select("select * from webuser where name like concat('%', #{name}, '%')")
//    public List<WebUser> listWebUser(String name);
    public List<WebUser> listWebUser(String name);
    public void deleteByIds(@Param("ids") List<Integer> ids);
}
