package com.jialin.websitedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping(path = {"/","/index"})
    @ResponseBody
    public String index(){
        return "hello susu";
    }
    @RequestMapping(path = {"/profile/{userName}/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("userName") String userName,
                          @RequestParam(value = "type",defaultValue = "-10") int type){
        return String.format("hello %s,welcome go back ID:%d type:%d", userName,userId,type);
    }
}
