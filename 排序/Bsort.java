public class Bsort {
    public static void bubblesort(int[] arr){
        int len =arr.length;
        while(len>0){
            for(int i=0;i<len-1;i++){
                if (arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                }
            }
            len--;
        }
    }
}
