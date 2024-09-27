package gui_demo;

import javax.swing.*;

/*
    继承案例:
        1.创建MyJFrame类,继承JFrame类,JFrame类中的方法我们就可以直接使用了
        2.提供空参构造,方法体中,完成了如下功能
            2.1 完成窗体的初始化 -> 抽取成方法initJFrame();
            2.2 完成基本组件绘制 -> 抽取成方法paintView();
        3.在测试类中,只需要通过空参,创建MyJFrame类对象 -> 完成窗体展示
 */
public class MyJFrame extends JFrame{
    //提供空参构造
    public MyJFrame(){
        //初始化窗体
        initFrame();
        //绘制基本组件
        paintview();
        this.setVisible(true);//显示窗体
    }
    //初始化窗体
    public void initFrame(){
        this.setTitle("用户登录");//设置标题
        this.setSize(500,500);//设置窗体大小
        this.setLocationRelativeTo(null);//居中显示
        this.setDefaultCloseOperation(3);//窗体关闭停止程序
        this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消窗体默认布局
    }
    //绘制基本组件
    public void paintview(){
        //显示用户名文本
        JLabel text01=new JLabel("用户名");
        text01.setBounds(50,50,50,20);
        this.add(text01);//添加到容器中
        //用户名输入框
        JTextField input01=new JFormattedTextField();
        input01.setBounds(150,50,180,20);
        this.add(input01);
        //显示密码文本
        JLabel text02=new JLabel("密码");
        text02.setBounds(50,150,50,20);
        this.add(text02);//添加到容器中
        //密码输入框
        JPasswordField input02=new JPasswordField();
        input02.setBounds(150,150,180,20);
        this.add(input02);

        //登录按钮
        JButton login=new JButton("登录");
        login.setBounds(50,200,280,20);
        this.add(login);
    }
}
