package com.itheima;

public class Demo04 {
    public static void main(String[] args) {
        //1.变量名不能重复
        int age = 10;
//        int age=2;//编译失败

        //2.变量未赋值不能使用
        char color;
//        System.out.println(color);//编译错误,color未赋值
        color = '蓝';
        System.out.println(color);

        //3.定义long类型,要在数据后加L(大小写都行,一般大写)
        long l1 = 10000;//将int类型的10000常量赋值给long类型的l1
//        long l2=10000000000;//编译错误
        //10亿超出了默认int类型的范围,需要将它声明为更大的类型
        long l2 = 10000000000L;

        //4.定义float类型,需要在后面加F(大小写都行,一般大写)
        double d=3.14;//将double类型的3.14赋值给了double类型的变量d
//        float f=3.14;//将double类型的3.14赋值给了float类型的变量f,float装不下,报错
        float f=(float)3.14;//强制类型转换,可能造成精度丢失,不允许

        //5.可以在一行定义多个变量,数据类型必须一致(不推荐)
        int a1=10,a2=20,a3=30;
        double d1=3.0,d2=4.0;
    }
}
