package com.itheima.enum_app.base;

public class Test {
    //根据红绿灯变化，执行交通
    public static void change(signal color){
        switch (color){
            case Red:
                System.out.println("停");
                break;
            case Green:
                System.out.println("行");
                break;
            case Yellow:
                System.out.println("等");
                break;
        }

    }

    public static void main(String[] args) {
        change(signal.Red);
    }
}
