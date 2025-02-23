package com.itheima;

import com.itheima.mapper.WebUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
class SpringbootMybatisQuickstartApplicationTests {
    @Autowired
    private WebUserMapper webUserMapper;

    @Test
    public void testListWebUser(){
        webUserMapper.LIST().stream().forEach(webUser -> {
            System.out.println(webUser);
        });
    }

    @Test
    void contextLoads() {
    }

}
