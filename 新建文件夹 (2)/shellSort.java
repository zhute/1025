import java.util.Arrays;

public class shellSort {
    public static void shellSort(int[] arr) {
        //对数据进行分组
        //每组数据进行插入排序: 逻辑分组
        // 同一组数据， 他们之间的间隔不一定为1
        int gap = arr.length;
        while (gap > 1) {
            gap = gap / 3 + 1;
            //i: 表示已排序数据的最后一个位置
            for (int i = 0; i < arr.length - gap; ++i) {
                int end = i;
                int key = arr[end + gap];

                while (end >= 0 && arr[end] > key) {
                    arr[end + gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {120, 9, 3, 2, 10, 35, 89, 0, 7, 12};
        int[] copy = arr.clone();


        System.out.println(Arrays.toString(copy));
        shellSort(copy);
        System.out.println(Arrays.toString(copy));

    }
}