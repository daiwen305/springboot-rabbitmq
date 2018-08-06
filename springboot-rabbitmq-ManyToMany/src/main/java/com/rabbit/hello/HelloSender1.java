package com.rabbit.hello;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender1 {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String msg) {
        String sendMsg = msg;
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }

}