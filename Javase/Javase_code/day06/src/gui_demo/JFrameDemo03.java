package gui_demo;

import javax.swing.*;

public class JFrameDemo03 {
    public static void main(String[] args) {
        //创建窗体
        JFrame jf=new JFrame();
        jf.setTitle("猜数字");//设置标题
        jf.setSize(400,300);//设置窗体大小
        jf.setLocationRelativeTo(null);//设置窗体居中
        jf.setDefaultCloseOperation(3);//关闭窗体结束程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //显示提示文本
        JLabel text=new JLabel("系统产生了一个1-100的数字,请猜一猜");
        text.setBounds(70,50,350,20);
        jf.add(text);

        //显示输入框
        JTextField input=new JTextField();
        input.setBounds(120,100,150,20);
        jf.add(input);

        //添加按钮
        JButton button=new JButton("我猜");
        button.setBounds(150,150,100,20);
        jf.add(button);

        jf.setVisible(true);//设置窗体可见
    }
}
