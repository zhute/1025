import java.util.Arrays;
public class Sort{
	public static void bubbleSort(int[] a){
		int s=0;
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
			if(a[j]>a[j+1]){
				s=a[j];
				a[j]=a[j+1];
				a[j+1]=s;
			}
			}
		}
	}
    public static void main(String[] args){
		int[] a={3,8,7,6,1};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}