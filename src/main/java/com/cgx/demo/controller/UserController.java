package com.cgx.demo.controller;

import com.cgx.demo.domain.User;
import com.cgx.demo.service.UserSerivce;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName:UserController
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/18 16:33
 * @Version:1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserSerivce userSerivce;

    @RequestMapping(value = "users",method = RequestMethod.GET)
    public String getUsersByUserName(@NonNull @RequestParam("userName") String userName){
        return userSerivce.getUserListByUserName(userName).toString();
    }

    @RequestMapping(value = "users/save",method = RequestMethod.GET)
    public String saveUser(@NonNull @RequestParam("userName") String userName){
        return userSerivce.save(User.builder().userName(userName).build()).toString();
    }

    @RequestMapping(value = "users/delete",method = RequestMethod.GET)
    public String deleteUser(@NonNull @RequestParam("userId") Integer userId){
        userSerivce.remove(userId);
        return "remove user success";
    }

    @RequestMapping(value = "users/findOne",method = RequestMethod.GET)
    public String findOne(@NonNull @RequestParam("userId") Integer userId){
        return   userSerivce.findOne(User.builder().userId(userId).build()).toString();
    }
}
