package com.jony.socket;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by jony on 17/10/19.
 * 单类模式
 */
public class SocketUtil {

    private static final int INPORT = 5000;
    private static DatagramSocket serverSocket = null;
    private static UDPServer udpServer = null;

    static {
        //初始化数据
        try {
            serverSocket = new DatagramSocket(INPORT);
        } catch (SocketException e) {
            e.printStackTrace();
        }

        if (serverSocket != null){
            udpServer = new UDPServer(serverSocket);

        }else {
            System.out.println("Server is null !");
        }
    }

    //私有化构造方法
    private SocketUtil(){
        startReceivingUDPMessages();
    }

    //创建对象并提供外部方法
    private static final SocketUtil socketUtil = new SocketUtil();
    public static SocketUtil getInstance(){
        return socketUtil;
    }

    //开启本地接收线程
    private  void  startReceivingUDPMessages(){

        if (serverSocket != null){
            new Thread(udpServer).start();
        }else {
            System.out.println("UDPServer open error !");
        }

    }
    //停止接收udp消息
    private void stopReceivingUDPMessages(){
        serverSocket.close();

    }

    //发送udp消息
    public void sendUDPMessages(String msg){

    }

}
