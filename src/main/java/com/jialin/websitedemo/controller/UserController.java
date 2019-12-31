package com.jialin.websitedemo.controller;

import com.jialin.websitedemo.model.User;
import com.jialin.websitedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = {"/user"})
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = {"/selectAll"})
    public String selectAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users",users);
        return "User";
    }
}
