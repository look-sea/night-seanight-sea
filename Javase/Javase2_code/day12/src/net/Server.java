package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket s=new ServerSocket(8090);
            System.out.println("服务器已启动");
            //监听客户连接,生成Socket对象
            Socket server=s.accept();
            System.out.println(server.getInetAddress().getHostAddress()+"连接成功");

            //基于Socket对象,获取网络输入流(接收数据)
            InputStream netINput = server.getInputStream();

            //利用网络输入流,获取客户端发来的数据
            byte[] bytes=new byte[1024];
            int len=netINput.read(bytes);
            String msg=new String(bytes,0,len);
            System.out.println(msg);

            //释放资源
            s.close();
            netINput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
