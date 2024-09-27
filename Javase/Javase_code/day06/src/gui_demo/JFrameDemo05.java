package gui_demo;

import javax.swing.*;

public class JFrameDemo05 {
    public static void main(String[] args) {
        //创建窗体
        JFrame jf=new JFrame();
        jf.setTitle("考勤查询");//设置标题
        jf.setSize(400,300);//设置窗体大小
        jf.setLocationRelativeTo(null);//设置窗体居中
        jf.setDefaultCloseOperation(3);//关闭窗体结束程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //文本
        JLabel text01=new JLabel("考勤日期");
        text01.setBounds(50,20,100,20);
        jf.add(text01);
        JLabel text02=new JLabel("开始时间");
        text02.setBounds(50,70,100,20);
        jf.add(text02);
        JLabel text03=new JLabel("结束时间");
        text03.setBounds(250,70,100,20);
        jf.add(text03);

        //文本框
        JTextField input01=new JTextField();
        input01.setBounds(50,100,100,20);
        jf.add(input01);
        JTextField input02=new JTextField();
        input02.setBounds(250,100,100,20);
        jf.add(input02);

        //按钮
        JButton button=new JButton("确定");
        button.setBounds(250,180,60,20);
        jf.add(button);

        jf.setVisible(true);//显示窗体
    }
}
