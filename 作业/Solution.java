public class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int n=0;n<nums.length;n++){
            if(nums[i]!=val){
                nums[i]=nums[n];
                i++;
            }
        }
      return i;
    }
