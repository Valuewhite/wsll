package com.itheima;

import com.itheima.mapper.WebUserMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;



@SpringBootTest
class FirstdemoApplicationTests {
    @Autowired
    private WebUserMapper webUserMapper;
    @Test
    public void testSelect(){
        System.out.println(webUserMapper.list());
    }
    @Test
    public void testDelete(){
        System.out.println(webUserMapper.deleteById(7));
    }
    @Test
    public void jwt(){
        Map<String, Object> claim = new HashMap<>();
        claim.put("id", 1);
        claim.put("name", "tom");
        String itheima = Jwts.builder().signWith(SignatureAlgorithm.HS256, "itheima").setClaims(claim)
                .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))
                .compact();
        System.out.println(itheima);
    }
    @Test
    void contextLoads() {
    }
    private static String signKey = "itheima";
    private static Long expire = 43200000L;
    @Test
    public  void jwt1(){
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 1);
        claims.put("name", "tom");
        String itheima = Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, signKey)
                .setExpiration(new Date(System.currentTimeMillis() + expire))
                .compact();
        System.out.println(itheima);
    }
}
