package src;

public class 二进制一的个数 {
    public int number(int sum){
        int n=0;
        while(sum!=0){
            sum=sum&(sum-1);
            n++;
        }
        return n;
    }
}
