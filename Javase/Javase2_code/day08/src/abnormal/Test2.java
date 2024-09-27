package abnormal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test2 {


    public static void main(String[] args) {
        final Logger LOGGER= LoggerFactory.getLogger("Test2的日志");
        int[] arr=null;
        try {
            method1(arr);
        }catch (RuntimeException e){
            System.out.println("处理异常");
            System.out.println(e.getMessage());
            LOGGER.error(e.getMessage());//日志中记录异常
        }
        System.out.println("main方法继续执行");

    }

    public static void method1(int[] arr) {
        if(arr==null){
            throw new RuntimeException("传递的参数不能为空");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void method2(int[] arr) {
        if(arr==null){
            System.out.println("传递的参数不能为空");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
