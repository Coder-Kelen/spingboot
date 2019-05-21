package com.cgx.demo.service;

import com.cgx.demo.dao.UserRepository;
import com.cgx.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName:UserServiceImpl
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/18 16:29
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserSerivce{
    @Autowired
    private UserRepository userRepository;

    @Override
    @Cacheable(value = "user",key = "#userName")
    public List<User> getUserListByUserName(String userName) {
        return userRepository.getUserByUserName(userName);
    }

    @Override
    @CachePut(value = "user",key = "#user.userId")
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    @CacheEvict(value = "user",key = "#userId")
    public void remove(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    @Cacheable(value = "user",key = "#user.userId")
    public User findOne(User user) {
        return userRepository.findById(user.getUserId()).get();
    }
}
