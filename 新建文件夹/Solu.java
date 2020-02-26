class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sum = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                sum[0] = i;
                break;
            }
        }

        if (sum[0] == -1) {
            return sum;
        }

        for (int j = nums.length-1; j >= 0; j--) {
            if (nums[j] == target) {
                sum[1] = j;
                break;
            }
        }

        return sum;
    }
}
