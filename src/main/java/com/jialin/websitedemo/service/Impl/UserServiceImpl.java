package com.jialin.websitedemo.service.Impl;

import com.jialin.websitedemo.mapper.UserMapper;
import com.jialin.websitedemo.model.User;

import com.jialin.websitedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll(){
        return userMapper.selectAllUser();
    }

   /* @Resource
    private UserRepository userRepository;

    @Override
    public User findById(Integer id){

        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id)   ;
    }

    @Override
    public List<User> findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
*/

}
