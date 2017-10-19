package com.jony.rabbitmq;

import java.io.Serializable;

/**
 * Created by jony on 17/10/17.
 */
public class UserMessage implements Serializable{

    private static final long serialVersionUID = 1L;

    private String userId;
    private String msg;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
