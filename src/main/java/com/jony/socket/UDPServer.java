package com.jony.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by jony on 17/10/19.
 */
public class UDPServer implements Runnable{

    //轮询线程管理类
    private PollingUtil sharedPollingUtil = PollingUtil.getInstance();

    private DatagramSocket serverSocket;
    private static final int dataLength = 1024;
    private byte[] recvBuf = new byte[dataLength];
    private DatagramPacket packet = new DatagramPacket(recvBuf, recvBuf.length);

    public UDPServer(DatagramSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    @Override
    public void run() {

        System.out.println("Server Start receiving !");

        while (true){
            try {
                serverSocket.receive(packet);
                final String recvString = new String(packet.getData(), 0, packet.getLength());
                System.out.println("UDP receviving: "+recvString);

                if (recvString.equals("761399")){
                    sharedPollingUtil.viewListInfo();
                    continue;
                }

                //通知
                sharedPollingUtil.interruptePollingThread(recvString);

//                new MsgListened(){
//                    @Override
//                    public String msg() {
//                        return recvString;
//                    }
//                };

            } catch (IOException e) {
                e.printStackTrace();

                System.out.println("UDP received thread error !");
                serverSocket.close();
                return;

            }

        }
    }
}
