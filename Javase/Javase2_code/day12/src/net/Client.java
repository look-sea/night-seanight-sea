package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            //创建客户端Socket对象,连接服务器
            Socket client=new Socket("192.168.1.198",8090);

            //基于Socket对象,获取网络输出流(发送数据)
            OutputStream netOutput = client.getOutputStream();

            //利用网络输出流,向服务器端发送数据
            netOutput.write("残余的力量总比绝望更多".getBytes());

            //释放资源
            client.close();
            netOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
