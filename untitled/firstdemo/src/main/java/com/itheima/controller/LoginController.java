package com.itheima.controller;

import com.itheima.mapper.WebUserMapper;
import com.itheima.pojo.Result;
import com.itheima.pojo.WebUser;
import com.itheima.service.WebUserService;
import com.itheima.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private WebUserService webUserService;
    @PostMapping("/login")
    public Result login(@RequestBody WebUser webUser){
        WebUser flag =  webUserService.login(webUser);
        if(flag != null){
            Map<String, Object> claims = new HashMap<>();
            claims.put("id", flag.getId());
            claims.put("name", flag.getName());
            claims.put("age", flag.getAge());
            String jwt = JwtUtils.jwt(claims);
            return Result.success(jwt);
        }
        else return Result.error("帐号或密码错误");
    }
}
