public class ArrayAverage{
	public static double average(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		double average=sum/a.length;
	}
	public static void main(String[] args){
		int[] a={2.9.8.5.7.6.3.1};
		System.out.println(average(a));
	}
}
			