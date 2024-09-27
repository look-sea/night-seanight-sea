package com;

/*
    String类成员方法
        1. int length(); 返回字符串长度 (包含字符的个数)
        2. boolean equals(字符串); 比较字符串内容
        3. boolean equalsIgnoreCase(字符串); 比较字符串内容忽略大小写
        4. String trim(); 去除字符串首、尾的空格
 */
public class StringDemo02 {
    public static void main(String[] args) {
        // 定义字符串
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "ABC";
        //s1,s2,s3均由""赋值,均存在于字符串常量池中

        //1. int length(); 返回字符串长度
        System.out.println(s1.length());//3
        //2. boolean equals(字符串); 比较引用类型数据的内容 (比较引用类型数据的地址,使用==)
        System.out.println(s1==s2);//true,地址相同
        //规则:看常量池中有没有和自己一样的字符串,如果没有则存入常量池,如果有拿来使用,所以s1与s2地址相同
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false

        //3. boolean equalsIgnoreCase(字符串); 比较引用类型数据的内容忽略大小写 (验证码)
        System.out.println(s1.equalsIgnoreCase(s2));//true

        //4. String trim(); 去除字符串首、尾的空格 (不能去除中间的空格)
        String str="    aa  a   ";
        System.out.println(str);//    aa  a
        System.out.println(str.trim());//aa  a

    }
}