public class ExchengeNum{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c=0;
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
}