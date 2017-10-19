package com.jony.rabbitmq;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by jony on 17/10/18.
 */
@PropertySource(value="classpath:application.properties")
@ImportResource({"classpath:spring-amqp.xml"})
public class RootConfig {

    @Bean
    public MessageContainer messageContainer() {
        return new MessageContainer();
    }

}