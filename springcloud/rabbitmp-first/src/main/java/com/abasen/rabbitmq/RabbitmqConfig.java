package com.abasen.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author abasen
 * @Description: 消息的配置类
 * @date 2018-03-31 22:22
 */
@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }
}
