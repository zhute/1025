public class Practice{
	public static void main(String[] args){
		/* int n=0;
		while(n<10){
			System.out.println(n);
			n++;
		}
		int n=1;
		int sum=0;
		while(n<=100){
			sum+=n;
			n++;
		}
		System.out.println(sum); */
		int a=0;
		int n=1;
		int sum=1;
		for( n = 1; n <=5; n++){
		sum=sum*n;
		a=sum+a;
		}		
		System.out.println(sum);
		 System.out.println(a);
	}
	
}