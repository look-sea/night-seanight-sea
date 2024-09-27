package gui_demo;

import javax.swing.*;

/*
    JTextField(文本框)
        显示一个输入框
    构造方法:
        JTextField(); 创建文本框对象
        JPasswordField 创建密码文本框对象
    成员方法:
        void setBounds(in x,int y,int 宽,int高)
 */
public class JFrameDemo01 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        jf.setTitle("用户登录");//设置标题
        jf.setSize(500,500);//设置窗体大小
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //显示用户名文本
        JLabel text01=new JLabel("用户名");
        text01.setBounds(50,50,50,20);
        jf.add(text01);//添加到容器中
        //用户名输入框
        JTextField input01=new JFormattedTextField();
        input01.setBounds(150,50,180,20);
        jf.add(input01);
        //显示密码文本
        JLabel text02=new JLabel("密码");
        text02.setBounds(50,150,50,20);
        jf.add(text02);//添加到容器中
        //密码输入框
        JPasswordField input02=new JPasswordField();
        input02.setBounds(150,150,180,20);
        jf.add(input02);

        //登录按钮
        JButton login=new JButton("登录");
        login.setBounds(50,200,280,20);
        jf.add(login);
        jf.setVisible(true);//显示窗体
    }
}
