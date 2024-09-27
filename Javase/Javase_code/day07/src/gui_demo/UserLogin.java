package gui_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
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

        //定义用户名和密码 (模拟注册的过程)
        String name="itheima";
        String pwd="123456";

        //给按钮添加点击事件
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //通过输入框对象, 获取用户输入的数据并去除用户输入的首尾空格
                String username=input01.getText().trim();
                String password=input02.getText().trim();

                //判断用户名长度,6-12位
                if(username.length()<6||username.length()>12){
                    //System.out.println("用户名的长度是6-12位,请重新输入");
                    //下一行代码实现了不在控制台输出而是由窗体弹出
                    //静态的成员方法是可以通过类名访问的
                    JOptionPane.showMessageDialog(jf,"用户名的长度是6-12位,请重新输入");
                    //清空文本框
                    input01.setText("");
                    input02.setText("");
                    return;//用户名不合法则不再弹出密码框
                }
                //判断密码长度
                if(password.length()<6||password.length()>12){
                    //System.out.println("密码的长度是6-12位,请重新输入");
                    JOptionPane.showMessageDialog(jf,"密码的长度是6-12位,请重新输入");
                    //清空文本框
                    input01.setText("");
                    input02.setText("");
                }
                //如果长度都合法, 再判断内容, 注意比较字符串内容, 使用equals方法
                if(username.length()>=6&&username.length()<=12&&password.length()>=6&&password.length()<=12){
                    if(username.equals(name)&&password.equals(pwd)){
                       // System.out.println("登陆成功");
                        JOptionPane.showMessageDialog(jf,"登陆成功");
                        //清空文本框
                        input01.setText("");
                        input02.setText("");
                    }else{
                        //System.out.println("用户名或密码错误");
                        JOptionPane.showMessageDialog(jf,"用户名或密码错误");
                        //清空文本框
                        input01.setText("");
                        input02.setText("");
                    }
                }

            }
        });

        jf.setVisible(true);//显示窗体
    }
}
