package src;

import java.util.ArrayList;
import java.util.Arrays;

public class 最小的k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        ArrayList<Integer> set = new ArrayList<Integer>();
        if(k<= 0 || k > input.length)
            return set;
        Arrays.sort(input);
        for(int i=0;i<k;i++){
            set.add(input[i]);
        }
        return set;
    }
}