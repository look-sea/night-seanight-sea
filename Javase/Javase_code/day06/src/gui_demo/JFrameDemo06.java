package gui_demo;

import javax.swing.*;

public class JFrameDemo06 {
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

        //创建日期选择对象,指定日期字符串格式
        DateChooser dateChooser1=DateChooser.getInstance("yyyy-MM-dd");
        DateChooser dateChooser2=DateChooser.getInstance("yyyy-MM-dd");
        //文本框
        JTextField input01=new JTextField();
        input01.setBounds(50,100,100,20);
        JTextField input02=new JTextField();
        input02.setBounds(250,100,100,20);
        //把日历控件与文本框绑定
        dateChooser1.register(input01);
        jf.add(input01);
        dateChooser2.register(input02);
        jf.add(input02);

        //按钮
        JButton button=new JButton("确定");
        button.setBounds(250,180,60,20);
        jf.add(button);


        jf.setVisible(true);//显示窗体
    }
}
