package com.itheima.interface_app.demo3;

public class MP3 implements Player {

    @Override
    public void play() {
        System.out.println("MP3播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("暂停播放音乐");
    }

    @Override
    public void stop() {
        System.out.println("停止播放音乐");
    }
}
