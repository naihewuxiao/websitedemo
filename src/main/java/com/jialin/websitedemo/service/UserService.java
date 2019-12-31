package com.jialin.websitedemo.service;


import com.jialin.websitedemo.model.User;

import java.util.List;

public interface UserService {
    /*
    User findById(Integer id);
    List<User> findAll();
    User save(User user);
    void delete(Integer id);

    List<User> findByUserName(String userName);

    Page<User> findAll(Pageable pageable);//分页查询*/
    List<User> findAll();
}
