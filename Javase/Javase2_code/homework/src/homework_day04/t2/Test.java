package homework_day04.t2;

import java.util.Arrays;

/*有以下数组定义：
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        要求：
        请打印数组所有元素
        请对数组元素进行“升序”排序
        请对排序后的数组再次打印。
        思路:
        借助Arrays的sort，toString方法完成*/
public class Test {
    public static void main(String[] args) {
        int[] arr = {1,332,43,25,3324,34,335,4,45,2,43,52,54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
