public class Main
   public void merge(int[] nums1, int m, int[] nums2, int n) {
	    int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0&&j>=0){
            if(nums1[i]>nums2[k]){
                nums1[k--]=nums1[i--];
				}else{
					nums1[k--]=nums2[j--];
					}
				}
					if(j>=0){ 
						int i=0; 
					for(int i=i+1;i<j+1;i++){ 
						nums1[i]=nums2[j++]; 
			} 
		} 
	}
}
