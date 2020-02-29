import java.util.Arrays;

public class MySort {
    public static void insertSort(int[] arr) {
        for (int i = 0; i <= arr.length; i++) {
            int key = arr[i + 1];
            int end = i;
            while (end >= 0 && arr[end] > key) {
                arr[end + 1] = arr[end];
                end--;
            }
            arr[end + 1] = key;
        }
    }

    public static void test1() {
        int[] arr = {120, 9, 3, 2, 10, 35, 89, 0, 7, 12};
        int[] copy = arr.clone();


        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(copy);
    }
}