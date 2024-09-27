package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemo07 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        jf.setSize(400,400);//设置大小
        jf.setTitle("JButton添加按钮");//设置标题
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //创建按钮对象
        JButton jButton01=new JButton("点击一下");
        jButton01.setBounds(150,300,100,20);
        jf.add(jButton01);

        jButton01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你不要过来啊");
            }
        });


        jf.setVisible(true);//设置窗体可见,写在最后
    }
}
