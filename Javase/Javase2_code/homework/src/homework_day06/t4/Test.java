package homework_day06.t4;

import java.util.Arrays;

/*编程题【选择排序】
        请按以下要求顺序编写程序：
        定义测试类，定义main()方法；
        定义以下数组：int[] arr = {7, 6, 5, 4, 3};
        用Arrays类打印此数组的所有元素；
        用“排序”对数组元素“升序”排序；打印排序后的数组。*/
public class Test {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3};

        // 用Arrays类打印此数组的所有元素
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;// 记录当前待排序中最小元素的索引

            int min = arr[minIndex];// 当前最小值
            for (int j = i; j < arr.length; j++) {
                // 如果当前待排序中有比当前元素还小的值
                if (arr[j] < min) {
                    // 把当前元素赋值给参照物
                    min = arr[j];
                    // 把当前元素的索引 , 赋值给minIndex
                    minIndex = j;
                }
            }

            // 如果当前元素不是最小值 , 那么和最小值作交换
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
