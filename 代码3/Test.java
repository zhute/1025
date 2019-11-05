public class Test{
	public static int count =0;
	public static void main(String[] args){
		System.out.println(fib(10));
		System.out.println(count);
	}
	public static int fib(int n){
		if (n == 1|| n == 2){
			return 1;
		}
		if(n==1){
		count++;
		}
		return fib(n-1)+fib(n-2);
	}
}