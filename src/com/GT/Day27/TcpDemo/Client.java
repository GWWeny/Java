package com.GT.Day27.TcpDemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        //细节:这创建的对象会同时连接服务端
        //如果连接不上，代码会报错
        Socket socket=new Socket("127.0.0.1",10086);
        //从连接通道获取输出流,用字符流而不是字节流来读取中文
        OutputStream os=socket.getOutputStream();
        //写出数据
        os.write("你好".getBytes());
        //释放资源
        os.close();
        socket.close();
    }
}
