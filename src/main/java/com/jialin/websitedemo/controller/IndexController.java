package com.jialin.websitedemo.controller;

import com.jialin.websitedemo.mapper.UserMapper;
import com.jialin.websitedemo.model.User;
import com.jialin.websitedemo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {
    @Autowired
    FirstService firstService;

    @Autowired
    UserMapper userMapper;


    @RequestMapping(path = {"/","/index"})  //接受浏览器对"localhost:8080/"或者"localhost:8080/index" 的请求
    @ResponseBody   //对接受到的请求进行反应，直接返回body 没有头部等其他标签
    public String index(){
        return "hello susu";
    }

    @RequestMapping(path = {"/test"})
    @ResponseBody
    public  String test(){
        User user = new User();
        user.setUserName("aaa");
        user.setPassword("bbb");
        user.setPhone("ccc");
        userMapper.insert(user);
        return "s";
    }


    @RequestMapping(path = {"/profile/{userName}/{userId}"})  //{}中的变量表示将要传进来的//中的字符串
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                          @PathVariable("userName") String userName,
                          @RequestParam(value = "type",defaultValue = "-10") int type){
        return String.format("hello %s,welcome go back ID:%d type:%d", userName,userId,type);
    }

    @RequestMapping(path = {"/test/{happy}"})
    @ResponseBody
    public String happy(@PathVariable("happy") String s){
        return String.format("hello %s", s);
    }

    @RequestMapping(path = {"/vmasd"})
    public String template(Model model){
        model.addAttribute("uid","123456789");
        model.addAttribute("name","Jerry");
        return "home";
    }


}
