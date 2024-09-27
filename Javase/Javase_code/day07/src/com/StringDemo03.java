package com;

//String类,在java中所有双引号引起来的内容,都可以看作是它的对象
public class StringDemo03 {
    public static void main(String[] args) {
        //空参构造
        String s1=new String();
        System.out.println(s1);

        //带参构造
        String s2=new String("abc");
        System.out.println(s2);

        //双引号直接赋值:在字符串常量池中存储
        String s3="abc";
        System.out.println(s3);

        //面试题
        System.out.println(s2==s3);//比较地址,false
        /*原因:s2进入栈内存,String("abc")进入堆内存,此时字符串常量池中
        并没有abc,于是添加,s3由双引号直接赋值,其地址在字符串常量池中,而
        s2地址是在栈中,并不相同,所以打印结果为false*/
        System.out.println(s2.equals(s3));//比较内容,true
    }
}
