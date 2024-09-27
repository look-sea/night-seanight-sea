package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNumber {
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

        //产生一个1-100的随机数
        Random r=new Random();
        int number=r.nextInt(100)+1;

        //添加按钮点击事件
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //未输入值则弹出提示
                if (input.getText().equals("")) {
                    JOptionPane.showMessageDialog(jf, "您还未输入数字");
                    return;
                }
                if (Integer.parseInt(input.getText()) >= 1&&Integer.parseInt(input.getText()) <= 100) {
                    //获取文本框内容,并将String类型转为int类型
                    int num = Integer.parseInt(input.getText());
                    //判断
                    if (num < number) {
                        JOptionPane.showMessageDialog(jf, "你猜小了");
                    } else if (num > number) {
                        JOptionPane.showMessageDialog(jf, "你猜大了");
                    } else {
                        JOptionPane.showMessageDialog(jf, "恭喜你,猜对了!");
                    }
                    //清空输入框
                    input.setText("");
                }else{
                    JOptionPane.showMessageDialog(jf,"你输入的值有误");
                    input.setText("");
                }

            }
        });

        jf.setVisible(true);//设置窗体可见
    }
}
