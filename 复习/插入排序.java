public class 插入排序 {
    public static void sort(int [] arr) {
        for(int i=0;i<=arr.length-1;i++){
            int k=arr[i+1];
            int end=i;
            while(end>=0&&arr[end]>k){
                arr[end+1]=arr[end];
                --end;
            }
            arr[end+1]=k;
        }

    }
}
