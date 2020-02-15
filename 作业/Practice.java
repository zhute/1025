public class Practice {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(int n=0;n<=nums.length;n++){
            if(nums[n]>=target){
                return n;
            }
            i=n+1;
        }
        return i;
    }
}