package com.itheima.controller;

import com.itheima.pojo.Result;
import com.itheima.pojo.WebUser;
import com.itheima.service.WebUserService;
import com.itheima.service.impl.WebUserServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
public class RequestController {
//        @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name = request.getParameter("name");
//        String ageStr = request.getParameter("age");
//        int age = Integer.parseInt(ageStr);
//        System.out.println(name + ":" + age);
//        return "ok";
//    }
//    @RequestMapping("/simpleParam1")
//    public String simpleParam1(String name, Integer age){
//        System.out.println(name + "----" + age);
//        return "ok1";
//    }
//    @RequestMapping("/simpleParam2")
//    public String simpleParam2(String name, Integer age){
//        System.out.println(name + "+++++" + age);
//        return "ok2";
//    }
//    @RequestMapping("/simpleParam3")
//    public String simpleParam3(String username, Integer age){
//        System.out.println(username + "+++++" + age);
//        return "ok1";
//    }
//    @RequestMapping("/simpleParam4")
//    public String simpleParam4(@RequestParam(name = "name") String username, Integer age){
//        System.out.println(username + "+++++" + age);
//        return "ok2";
//    }
//    @RequestMapping("/simpleParam")
//    public String simpleParam3(WebUser webUser) {
//        System.out.println(webUser);
//        return "ok";
//    }
//    @RequestMapping("/simpleParam")
//    public String simpleParam(WebUser webUser) {
//        System.out.println(webUser);
//        return "ok";
//    }
//    @RequestMapping("/arrayParam")
//    public String arrayParam(String[] hobby) {
//        System.out.println(Arrays.toString(hobby));
//        return "ok";
//    }
//    @RequestMapping("/listParam")
//    public String listParam(@RequestParam List<String> hobby) {
//        System.out.println(hobby);
//        return "ok";
//    }
//    @RequestMapping("/dateParam")
//    public String dateParam(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime updateTime) {
//        System.out.println(updateTime);
//        return "ok";
//    }
//    @RequestMapping("/jsonParam")
//    public String jsonParam(@RequestBody WebUser webUser) {
//        System.out.println(webUser);
//        return "ok";
//    }
//    @RequestMapping("/path/{id}/{name}")
//    public String pathParam(@PathVariable Integer id, String name) {
//        System.out.println(id + ":" +name);
//        return "ok";
//    }
    @Autowired
    private WebUserService webUserService;
    @RequestMapping("/listWebUser")
    public Result list() {
        return Result.success(webUserService.listWebUser());
    }
}
