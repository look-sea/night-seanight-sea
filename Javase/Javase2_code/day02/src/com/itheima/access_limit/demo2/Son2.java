package com.itheima.access_limit.demo2;

import com.itheima.access_limit.demo1.Father2;

public class Son2 extends Father2 {
    public void show(){
        //this.num;//报错,说明默认权限修饰的变量不可在不同包下访问
    }
}
