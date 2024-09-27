package com.itheima;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackDemo1 {
    //获取一个Logger对象(使用日志记录相关操作)
    private static Logger logger= LoggerFactory.getLogger("LogbackDemo1类");
    public static void main(String[] args) {
        logger.info("进入到main方法中执行程序...");
        logger.debug("调用show()方法执行");
        show();
    }
    public static void show(){
        logger.trace("show方法开始执行");
    }
}
