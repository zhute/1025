import java.util.Arrays;

public class 希尔排序 {
    public static void shellSort(int[] arr) {
        int gap = arr.length / 3;
        for (int i = 0; i < arr.length - 1; i++) {
            int end = i;
            int key = arr[end + gap];

            while (end >= 0 && arr[end] > key) {
                arr[end + gap] = arr[end];
                end -= gap;
            }
            arr[end + gap] = key;
        }
    }
    public static void main(String[] args){
        int[] arr={1,8,5,10,90,0,12,6,8};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);


    }


}

