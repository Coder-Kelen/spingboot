package com.cgx.demo;

import com.cgx.demo.service.ActivemqSenderServies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.cgx.demo.*"})
@EnableCaching
public class DemoApplication  {
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    ActivemqSenderServies activemqSenderServies;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
