package com.GT.Day27;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo1 {
    public static void main(String[] args) throws IOException {
        //创建DataGramSocket对象
        //细节：
        //绑定端口，以后我们就通过这个端口往外发送
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定
        DatagramSocket ds = new DatagramSocket();
        //打包数据
        String str="快开门，我是你们的队长阿威嗄！";
        byte[] bytes=str.getBytes();
        InetAddress address=InetAddress.getByName("127.0.0.1");
        int port =10086;

        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
