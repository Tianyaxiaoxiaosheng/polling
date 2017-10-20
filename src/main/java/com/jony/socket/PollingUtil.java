package com.jony.socket;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Manage the polling thread
 * Created by jony on 17/10/19.
 */
public class PollingUtil {

    //单例模式
    private PollingUtil(){

    }

    private static final PollingUtil shareadPollingUtil = new PollingUtil();
    public static PollingUtil getInstance(){
        return shareadPollingUtil;
    }

    //polling thread list
    //hashtable相对于hashmap线程安全，不需要再去为保证线程安全而做工作
    Hashtable<String, Thread> pollingThreadList = new Hashtable<String, Thread>();

    //add thread to list
    public boolean addPollingThreadToList(String tag, Thread pollingThread){

        if (findPollingThread(tag) == null) {
            pollingThreadList.put(tag, pollingThread);
            return true;
        }else {
            return false;
        }
//        pollingThreadList.put(tag, pollingThread);
//        return true;
    }

    //interrupte and remove
    //在收到消息是调用改方法
    public void interruptePollingThread(String tag){

//        System.out.println("find ...... ");

        Thread pollingThread = findPollingThread(tag);
        if (pollingThread != null){

//            System.out.println("interrupt ...... ");
            pollingThread.interrupt();

            //移除放在返回睡眠
//            removePollingThread(tag);
        }
    }

    //find thread in list
    private Thread findPollingThread(String tag){
        Enumeration<String> e = pollingThreadList.keys();

//        System.out.println("find count : "+pollingThreadList.size());

        while (e.hasMoreElements()){

            String key = e.nextElement();

//            System.out.println("find: "+key+" ,tag: "+tag);

            if (tag.equals(key)){

//                System.out.println("find success!");
                return pollingThreadList.get(key);
            }
        }

        return null;
    }

    //remove thread
    public boolean removePollingThread(String tag){

        Thread pollingThread = findPollingThread(tag);

        if (pollingThread != null){
            pollingThreadList.remove(tag);
            return true;
        }else {
            return false;
        }
    }


    //view list infomation
    public void viewListInfo(){

        System.out.println("List infomation: count: "+pollingThreadList.size());
    }

}
