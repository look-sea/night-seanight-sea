package gui_demo;

import javax.swing.*;

public class JFrameDemo04 {
    public static void main(String[] args) {
        //创建窗体
        JFrame jf=new JFrame();
        jf.setTitle("手机日期和时间显示");//设置标题
        jf.setSize(400,300);//设置窗体大小
        jf.setLocationRelativeTo(null);//设置窗体居中
        jf.setDefaultCloseOperation(3);//关闭窗体结束程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //日期文本
        JLabel text01=new JLabel("日期");
        text01.setBounds(50,50,100,20);
        jf.add(text01);
        //具体日期
        JLabel text02=new JLabel("xxxx年xx月xx日");
        text02.setBounds(50,80,200,20);
        jf.add(text02);

        //时间文本
        JLabel text03=new JLabel("时间");
        text03.setBounds(50,150,100,20);
        jf.add(text03);
        //具体时间
        JLabel text04=new JLabel("xx:xx:xx");
        text04.setBounds(50,180,200,20);
        jf.add(text04);

        jf.setVisible(true);//显示窗体
    }
}
