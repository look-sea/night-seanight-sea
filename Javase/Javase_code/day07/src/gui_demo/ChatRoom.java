package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatRoom {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf = new JFrame();
        jf.setTitle("聊天室");//设置标题
        jf.setSize(400, 300);//设置窗体大小
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //文本域
        JTextArea text = new JTextArea();
        text.setBounds(10, 10, 360, 200);
        jf.add(text);
        //文本框
        JTextField text02 = new JTextField();
        text02.setBounds(10, 230, 180, 20);
        jf.add(text02);
        //按钮
        JButton jb01 = new JButton("发送");
        jb01.setBounds(200, 230, 70, 20);
        jf.add(jb01);
        JButton jb02 = new JButton("清空聊天");
        jb02.setBounds(280, 230, 100, 20);
        jf.add(jb02);

        jb01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框内容
                String txt = text02.getText();

                /*
                    对发送的信息进行非空判断->空值->错误提示,结束方法
                        1.判断不为空
                        2.判断长度不为零
                        3.和""字符串进行比较
                */
                /*//1.判断不为空
                if (txt.isEmpty()) {
                    JOptionPane.showMessageDialog(jf, "不能发送空的信息");
                    return;
                }*/
                /*//2.判断长度不为零
                if (txt.length() == 0) {
                    JOptionPane.showMessageDialog(jf, "不能发送空的信息");
                    return;
                }*/
                //3.和""字符串进行比较
                if (txt.equals("")) {
                    JOptionPane.showMessageDialog(jf, "不能发送空的信息");
                    return;
                }

                //把文本框的内容发送到文本域中
                //text.setText(txt);//只能发送一条,本质是设置文本域内容
                //多次发送的内容以追加的方式呈现
                text.append(txt + "\n");//"\n"实现换行
                //清空文本框
                text02.setText("");
            }
        });

        //实现清空聊天功能
        jb02.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });

        jf.setVisible(true);//显示窗体
    }
}
