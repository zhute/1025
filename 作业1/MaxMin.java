public class MaxMin{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int max=0;
		int min=0;
		if(a<b)
          max=b ;
        else    
			max=a ;
        if(max<c)   
			max=c ;
		else
		System.out.println(max);
		if(a<b)
          min=a ;
        else    
			min=b;
        if(min>c)   
			min=c ;
		else
		System.out.println(min);
	}
}
		