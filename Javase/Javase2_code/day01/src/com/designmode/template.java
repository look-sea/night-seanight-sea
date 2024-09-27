package com.designmode;

public abstract class template {
    public void writeComposition() {
        head();
        context();
        end();
    }
    private void head(){
        System.out.println("我的爸爸");
    }
    public abstract void context();
    private void end(){
        System.out.println("啊~这就是我的爸爸");
    }
}
