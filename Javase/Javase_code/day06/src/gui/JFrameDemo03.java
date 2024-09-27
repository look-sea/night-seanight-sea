package gui;

import javax.swing.*;

/*
    JFrame(常用设置)
        void setTitle(String title); 设置窗体标题
        void setLocationRelativeTo(null); 设置窗体位置在中央弹出
        void setDefaultCloseOperation(3); 设置窗体关闭停止程序
        void setAlwaysOnTop(true); 设置窗体置顶
 */
public class JFrameDemo03 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        jf.setSize(400,400);//设置大小
        jf.setTitle("JButton添加按钮");//设置标题
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //添加基本组件
        //创建按钮对象
        JButton jButton01=new JButton("按钮一");
        jButton01.setBounds(80,300,100,20);
        jf.add(jButton01);
        JButton jButton02=new JButton("按钮二");
        jButton02.setBounds(200,300,100,20);
        jf.add(jButton02);

        jf.setVisible(true);//设置窗体可见,写在最后
    }
}
