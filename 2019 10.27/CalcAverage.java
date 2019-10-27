public class CalcAverage {
	public static void main(String[] args) {
		/*int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int m = Integer.parseInt(args[3]);
		int average=(x+y+z+m)/4;
		System.out.println(average);*/
		
		int sum=0;
		for(int i=0;i<args.length;i++){
			sum+=Integer.parseInt(args[i]);
		}
		double average=1.0*sum/args.length;
		System.out.println(average);
	}
}
		