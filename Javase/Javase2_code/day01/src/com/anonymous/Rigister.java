package com.anonymous;

import java.util.ArrayList;
import java.util.Scanner;

public class Rigister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名");
        String name = sc.next();
        System.out.println("手机号");
        String phonenumber = sc.next();
        String password1;
        String password2;
        while(true) {
            System.out.println("密码");
            password1 = sc.next();
            System.out.println("确认密码");
            password2 = sc.next();
            if (password1.equals(password2)) {
                break;
            }else{
                System.out.println("两次密码不一致");
            }
        }
        System.out.println("邮箱");
        String email = sc.next();
        System.out.println("性别");
        String sex = sc.next();
        System.out.println("生日");
        String birthday = sc.next();
        ArrayList<User> userList=new ArrayList<>();
        userList.add(new User(name,phonenumber,password1,password2,email,sex,birthday));
        for(User user:userList){
            System.out.print(user.getName());
            System.out.print(user.getPhonenumber());
            System.out.print(user.getPassword1());
            System.out.print(user.getPassword2());
            System.out.print(user.getEmail());
            System.out.print(user.getSex());
            System.out.println(user.getBirthday());
        }
    }
}
