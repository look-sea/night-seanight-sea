package gui_demo;

import javax.swing.*;

public class JFrameDemo02 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        jf.setTitle("聊天室");//设置标题
        jf.setSize(400,300);//设置窗体大小
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //文本域
        JTextArea text=new JTextArea();
        text.setBounds(10,10,360,200);
        jf.add(text);
        //文本框
        JTextField text02=new JTextField();
        text02.setBounds(10,230,180,20);
        jf.add(text02);
        //按钮
        JButton jb01=new JButton("发送");
        jb01.setBounds(200,230,70,20);
        jf.add(jb01);
        JButton jb02=new JButton("清空聊天");
        jb02.setBounds(280,230,100,20);
        jf.add(jb02);

        jf.setVisible(true);//显示窗体
    }
}
