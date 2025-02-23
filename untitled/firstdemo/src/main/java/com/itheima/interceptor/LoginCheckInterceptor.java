package com.itheima.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.itheima.pojo.Result;
import com.itheima.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Slf4j
@Component
public class LoginCheckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(">>>");
        String url = String.valueOf(request.getRequestURL());
        if(url.contains("login")){
            log.info("登录界面，放行");
            return true;
        }
        String jwt = request.getHeader("token");
        if(jwt == null || jwt.length() == 0){
            log.info("请求头token为空，返回未登录的信息");
            Result result = Result.error("NOT_LOGIN");
            String s = JSONObject.toJSONString(result);
            response.getWriter().write(s);
            return false;
        }
        try {
            JwtUtils.parseJWT(jwt);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("令牌解析失败，返回未登录的信息");
            Result result = Result.error("NOT_LOGIN");
            String s = JSONObject.toJSONString(result);
            response.getWriter().write(s);
            return false;
        }
        log.info("令牌合法，放行");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
