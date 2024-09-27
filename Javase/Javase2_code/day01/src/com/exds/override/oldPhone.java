package com.exds.override;

public class oldPhone {

    public oldPhone(String a){
        send();
    }

    public void send(){
        System.out.println("发信息");
    }
    public void dial(){
        System.out.println("打电话");
    }
    private void chai(){
        System.out.println("卸电池");
    }
}
