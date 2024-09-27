package com.itheima.interface_app.demo3;

//MP4实现接口中的规则
public class MP4 implements Player {
    @Override
    public void play() {
        System.out.println("MP4播放音乐");
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
