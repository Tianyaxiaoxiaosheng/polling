package com.jony.rabbitmq;

import org.springframework.web.context.request.async.DeferredResult;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jony on 17/10/18.
 */
public class MessageContainer {

    private ConcurrentHashMap<String, DeferredResult> userMessages = new ConcurrentHashMap<String, DeferredResult>();	//线程安全

    public ConcurrentHashMap<String, DeferredResult> getUserMessages() {
        return userMessages;
    }

}