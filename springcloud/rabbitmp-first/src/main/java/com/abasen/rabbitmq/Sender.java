package com.abasen.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author abasen
 * @Description: 消息生产者
 * @date 2018-03-31 22:14
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender: " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }
}
