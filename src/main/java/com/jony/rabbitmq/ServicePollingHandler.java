package com.jony.rabbitmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.Map;

/**
 * Created by jony on 17/10/18.
 */
public class ServicePollingHandler {

    @Autowired
    MessageContainer messageContainer;

    public void testPollingHandle(UserMessage userMessage)
    {
        Map<String, DeferredResult> msgContainer = messageContainer.getUserMessages();
        DeferredResult<UserMessage> deferredResult = msgContainer.get(userMessage.getUserId());

        if (deferredResult!=null){
            deferredResult.setResult(userMessage);  //调用setResult()，线程返回信息。
        }
    }
}










