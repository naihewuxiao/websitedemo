package com.jialin.websitedemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {


    public String develop(String name){
        return name+" zhenshuai!";
    }
}
