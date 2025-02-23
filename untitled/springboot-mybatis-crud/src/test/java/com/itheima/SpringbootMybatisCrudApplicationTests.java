package com.itheima;

import com.itheima.mapper.WebUserMapper;
import com.itheima.pojo.WebUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private WebUserMapper webUserMapper;
    @Test
    public void testDelete(){
        webUserMapper.delete(2);
    }
    @Test
    public void testInsert(){
        WebUser webUser = new WebUser();
        webUser.setName("jj1");
        webUser.setAge(11);
        webUser.setGender(1);
        webUser.setPhone("111");
        webUserMapper.insert(webUser);
        System.out.println(webUser.getId());
    }
    @Test
    public void testUpdate(){
        WebUser webUser = new WebUser();
        webUser.setId(7);
        webUser.setName("jj3");
        webUserMapper.update2(webUser);
    }
    @Test
    public void testSelect(){
        System.out.println(webUserMapper.select(7));
    }
    @Test
    public void testSelectList(){
        List<WebUser> webUsers = webUserMapper.listWebUser("j");
        System.out.println(webUsers);
    }
    @Test
    public void testDeleteByIds(){
        List<Integer> ids = Arrays.asList(1, 2, 3);
        webUserMapper.deleteByIds(ids);
    }

    @Test
    void contextLoads() {
    }

}
