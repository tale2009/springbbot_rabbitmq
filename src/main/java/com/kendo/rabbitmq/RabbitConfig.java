package com.kendo.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Stephanie on 2017/9/6.
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue(){
        return new Queue("hello");
    }
}
