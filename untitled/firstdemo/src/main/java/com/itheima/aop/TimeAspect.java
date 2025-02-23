package com.itheima.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
@Order(1)
@Slf4j
@Component
@Aspect
public class TimeAspect {
    @Pointcut("execution(* com.itheima.service.*.*(..))")
    private void pt(){}
    @Around("pt()")
    public Object recordTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info( joinPoint.getSignature() + "{}ms", end - begin);
        return proceed;
    }
}
