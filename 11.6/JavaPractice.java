import java.util.Arrays;
public class JavaPractice{
	public static int binarySearch(int[] a,int v){
		int left=0;
		int right=a.length-1;
		while(left<right){
			int mid=(left+right)/2;
            if(v == mid){
              return mid;
			}else if(v<mid){
			  right=mid;
			}else{
			  left=mid=1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int[] a={2,6,3,8,4,6};
		System.out.println(binarySearch(a,3));
	}
}
		