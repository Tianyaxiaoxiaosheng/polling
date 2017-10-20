package com.jony.controller;

import com.jony.socket.PollingUtil;
import com.jony.socket.SocketUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jony on 17/10/17.
 */

@Controller
public class PollingController {

    private static final String TAG = "PollingController";

    //Controller默认单类多线程,轮询线程管理类
    private PollingUtil sharedPollingThread = PollingUtil.getInstance();

    //socket 管理
    private SocketUtil sharedSocketUtil = SocketUtil.getInstance();

    @RequestMapping(value = "/msgtest", method = RequestMethod.GET)
    public String msgtest() {

        return "msgtest";
    }

    @RequestMapping(value="/msg", method = RequestMethod.POST)
    @ResponseBody
    public String msg(String param){

       System.out.println("lang polling: tag="+param);

        //参数作为当前线程的标志
        if (!sharedPollingThread.addPollingThreadToList(param,Thread.currentThread())) {
            return "falled";
        }

        try {
            Thread.sleep(1000*30);

        } catch (InterruptedException e) {
//            e.printStackTrace();
            return "daduan";
        }finally {
            sharedPollingThread.removePollingThread(param);
        }

//        String msg = null;
//        if (msgListened.msg() != null){
//            return "new msg";
//        }

        return "server msg"+param;
    }


}

