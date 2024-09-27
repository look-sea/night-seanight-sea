package practise.arrays;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={7,3,1,4,6,2,5,9,8};
        Arrays.sort(arr);//对数组排序
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //返回数组内容的字符串表示形式
        String s1=Arrays.toString(arr);
        System.out.println(s1);
        s1=s1.replaceAll(","," ");//将所有的","替换为" "
        System.out.println(s1.length());
        s1=s1.substring(1,s1.length()-1);//返回两个参数之间的字符串,左闭右开
        System.out.println(s1);

    }
}
