package com.GT.Day27;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        //细节：
        //在接收的时候一定要绑定端口
        //绑定的端口要和发送的端口一致
        DatagramSocket ds=new DatagramSocket(10086);

        //接收数据包
        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        System.out.println("准备接收数据");
        ds.receive(dp);
        System.out.println("已经接收数据");

        //解析数据包
        byte[] data=dp.getData();
        int length=dp.getLength();
        InetAddress address=dp.getAddress();
        int port=dp.getPort();
        System.out.println("接收到的数据是："+new String(data,0,length));
        System.out.println("发送方的地址是："+address+"端口号是:"+port);

        //释放资源
        ds.close();

    }
}
