public class Practice{
	public static int max(int[] arr){
		int max=arr[0];
		for(int i=0;i<a.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max；
	}
	public static int binarySearch(int[] a,int v){
		int left=0;
		int right=a.length-1;
		while(left<right){
			int mid=(left+right)/2;
            if(v == a[mid]){
              return mid;
			}else if(v<mid){
			  right=mid;
			}else{
			  left=mid=1;
			}
		}
		return -1;
	}
	
	public static void mian(String[] args){
		int[] a={6,2,6,7,5,9};
		System.out.println(binarySearch(a,3));
		System.out.println(max);
	}
}
	
	
	
	
	
	
	
	
	