package gui;

/*
    JLabel(显示文本和图像)
        短文本字符串或者图像的显示区域

    构造方法:
        JLabel(String text); 使用指定文本创建对象
        JLabel(ImageIcon image); 使用指定图像创建对象
            ImageIcon(String 路径); 指定文件创建ImageIcon
                绝对路径:从盘符开始的完整路径
                相对路径:取用其他路径名相对的路径(一般相对项目或者模块)
    成员方法:
        void setBounds(in x,int y,int 宽,int高)
 */
import javax.swing.*;

public class JFrameDemo04 {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame jf=new JFrame();
        jf.setSize(500,500);//设置大小
        jf.setTitle("JLabel显示文本和图像");//设置标题
        jf.setLocationRelativeTo(null);//居中显示
        jf.setDefaultCloseOperation(3);//窗体关闭停止程序
        jf.setAlwaysOnTop(true);//置顶
        jf.setLayout(null);//取消窗体默认布局

        //创建标签对象->显示图片
        ImageIcon img1=new ImageIcon("D:\\project\\workspace\\Javase_code\\day06\\imgs\\img1.png");//绝对路径
        JLabel text01=new JLabel(img1);
        //上两行代码与下一行代码等价
        //JLabel text01=new JLabel(new ImageIcon("D:\\project\\workspace\\Javase_code\\day06\\imgs\\img1.png"));
        text01.setBounds(50,50,100,143);//设置位置,大小
        jf.add(text01);
        ImageIcon img2=new ImageIcon("day06\\imgs\\img1.png");//相对路径,一般相对模块
        JLabel text02=new JLabel(img2);
        text02.setBounds(150,150,100,143);//设置位置,大小
        jf.add(text02);

        //创建标签对象->添加文本
        JLabel text03=new JLabel("我是文本");
        text03.setBounds(0,0,100,20);//设置位置,大小
        jf.add(text03);//添加到容器中



        jf.setVisible(true);//设置窗体可见,写在最后
    }
}
