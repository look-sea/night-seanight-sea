package com.exds.override;

public class newPhone extends oldPhone{
    public newPhone(){
        this("a");
        send();
        dial();
        System.out.println("--------------");
    }
    public newPhone(String b){
        super("a");
        System.out.println("aaaaaaaa");
    }
    @Override
    public void send(){
        super.send();
        System.out.println("发图片");
    }

    @Override
    public void dial() {
        super.dial();
        System.out.println("打视频");
    }
}
