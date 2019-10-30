public class WhlieDemo{
	public static void main(String[] args){
		int sum=0;
		for(int i=1;i<=5;i++){
			int a=1;
		for(int m=1;m<=i;m++){
			a*=m;
		}
		sum+=a;
		}
		System.out.println("sum = " + sum);
	}
}
		    