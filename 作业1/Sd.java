import java.util.*;

public class Sd {
    public static  int count(int[] A, int n) {
        int i = 0;
        int j;
        int sum = 0;
        if (n < 2) {
            return sum;
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (A[i] > A[j]) {
                    sum = sum + 1;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,0};
        int b=8;
        System.out.println(count(a,b));
    }

}

