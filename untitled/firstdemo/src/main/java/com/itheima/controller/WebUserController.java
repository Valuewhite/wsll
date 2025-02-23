package com.itheima.controller;

import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.pojo.WebUser;
import com.itheima.service.WebUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlReturnResultSet;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class WebUserController {
    @Autowired
    private WebUserService webUserService;
//    @RequestMapping(value = "/webusers",method = RequestMethod.GET)
    @GetMapping("/webusers")
    public Result list(){
        log.info("查询全部数据");
        List<WebUser> webUsers = webUserService.list();
        return Result.success(webUsers);
    }
    @DeleteMapping("/webusers")
    public Result deleteById(Integer id){
        log.info("删除id为" + id);
        Integer flag = webUserService.deleteById(id);
        if(flag != 0)
        return Result.success();
        else return Result.error("失败");
    }
    @GetMapping("/page")
    public Result listSelect(Integer start, Integer pageSize){
        PageBean pageBean = webUserService.page(start, pageSize);
        return Result.success(pageBean);
    }
}
