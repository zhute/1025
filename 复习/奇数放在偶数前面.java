package src;

public class 奇数放在偶数前面 {
    public void reOrderArray(int [] array){
        int k=0;
        for(int i=0;i<array.length;i++){
            if((array[i]&i)==1){
                int tem=array[i];
                int j=i;
                while(j>k){
                    array[j]=array[j-1];
                    j--;
                }
                array[k++]=tem;
            }
        }
    }
}
