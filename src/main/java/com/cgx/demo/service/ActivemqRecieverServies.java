package com.cgx.demo.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName:ActivemqRecieverServies
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/19 19:15
 * @Version:1.0
 */
@Service
public class ActivemqRecieverServies {
    @JmsListener(destination = "test-ds")
    public void recieve(String msg){
        System.out.println("activemq msg:"+msg);
    }
}
