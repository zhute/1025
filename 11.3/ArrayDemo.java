public class ArrayDemo{
	public static int max(int[] a){
		int size=a.length;
		int max=a[0];
		for(int i=0;i<size;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
                return max;			
	}
	
	
	public static int indexOf(int[] a,int v){
		for(int i=0;i<a.length;i++){
			if(a[i]=v){
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args){
		int[] a={2.9.8.5.7.6.3.1};
		System.out.println(max(a));
		System.out.println(inderOf(a,8));
	}
}
	
	
			
			
			
			
		
		