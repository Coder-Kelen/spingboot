package com.cgx.demo.service;

/**
 * @ClassName:ActivemqSenderServies
 * @Description:TODO
 * @Author:CHENGUOXUAN
 * @Date:2019/5/19 19:09
 * @Version:1.0
 */
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Service
public class ActivemqSenderServies implements MessageCreator {
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("test msg");
    }
}
