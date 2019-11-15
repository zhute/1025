import java.util.Arrays;
public class Array{
	public static void swap(int[] a,int i,int j){
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	
	public static void bubbleSort(int[] a){
		for(int i=0;i<=a.length-1;i++){
			for(int j=0;j<=a.length-1-1;j++){
				if(a[j]>a[j+1]){
					swap(a,j,j+1);
				}
			}
		}
	}
	
	
	

	public static void main(String[] args){
		int[] a={5,6,7,2,8};
		int[] b={5,4,3,2,1,};
		bubbleSort(a);
		bubbleSort(b);
		System.out.println(Arrays.toString(a));	
		System.out.println(Arrays.toString(b));
	}
}