import java.util.Arrays;

public class selectSort {

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void selectSort(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        while (begin < end) {

            int minIdx = begin;
            int maxIdx = begin;
            for (int i = begin; i <= end; ++i) {
                //最小值选前面
                if (arr[i] < arr[minIdx])
                    minIdx = i;
                //最大值选后面
                if (arr[i] >= arr[maxIdx])
                    maxIdx = i;
            }
            swap(arr, begin, minIdx);
            //如果最大值在起始位置，则经过上面的交换之后，最大值被移动到minIdx指向的位置
            if (maxIdx == begin)
                maxIdx = minIdx;

            swap(arr, end, maxIdx);
            ++begin;
            --end;
        }
    }

    public static void main(String[] args) {
        int[]  arr = {120,9,3,2,10,35,89,0,7,12};
        int[]  copy = arr.clone();


        System.out.println(Arrays.toString(copy));
        selectSort(copy);
        System.out.println(Arrays.toString(copy));

    }
    }
