package com.jialin.websitedemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.logging.Logger;

@Aspect
@Component
public class IndexAspect {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IndexAspect.class);
    @Before("execution(* com.jialin.websitedemo.controller.*.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        StringBuilder sb = new StringBuilder();
        for (Object arg: joinPoint.getArgs()){
            sb.append("arg: "+arg.toString()+" | ");
        }
        logger.info("Before method "+sb.toString());

    }

    @After("execution(* com.jialin.websitedemo.controller.*.*(..))")
    public void afterMethod(){
        logger.info("After method "+new Date());
    }
}
