package com.cgx.demo.service;

import com.cgx.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @InterfaceName:UserSerivce
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/18 16:28
 * @Version:1.0
 */
public interface UserSerivce {
    List<User> getUserListByUserName(String userName);
    User save(User user);
    void remove(Integer userId);
    User findOne(User user);
}
