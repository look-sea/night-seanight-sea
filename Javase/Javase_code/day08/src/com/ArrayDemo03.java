package com;

/*
    案例: 案例2(获取最值)

        最值包含最大值,最小值
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //定义数组
        int[] arr={23,45,76,12,91};
        //求数组的最大元素
        //1.暂且认为数组第一个元素是max
        int max=arr[0];
        //2.遍历数组 -> 数组名.fori + 回车
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //循环结束,打印最终的max
        System.out.println("最大值是"+max);

        //求数组的最小元素
        //1.暂且认为数组第一个元素是min
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        //循环结束,打印最终的min
        System.out.println("最小值是"+min);
    }
}