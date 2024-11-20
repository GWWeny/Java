package com.GT.Day27.TcpDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据
        //创建对象ServerSocker
        ServerSocket ss=new ServerSocket(10086);
        //监听客户端的连接
        Socket socket=ss.accept();
        //获取输入流
        //InputStream is=socket.getInputStream();
        BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //读取数据
        int b;
        while((b=is.read())!=-1){
            System.out.print((char)b);
        }
        //释放资源
        is.close();
        socket.close();
    }
}
