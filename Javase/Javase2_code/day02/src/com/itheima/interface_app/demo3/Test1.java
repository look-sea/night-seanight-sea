package com.itheima.interface_app.demo3;

public class Test1 {
    public static void main(String[] args) {
        MP3 mp3=new MP3();
        mp3.play();
        mp3.pause();
        mp3.stop();
        MP4 mp4=new MP4();
        mp4.play();
        mp4.pause();
        mp4.stop();
        Phone phone=new Phone();
        phone.play();
        phone.pause();
        phone.stop();
        System.out.println("===========");
        demo(mp3);
        demo(mp4);
        demo(phone);
    }

    public static void demo(Player p){
        p.play();
        p.pause();
        p.stop();
    }
}
