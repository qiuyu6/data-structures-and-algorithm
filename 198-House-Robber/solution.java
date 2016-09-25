public class Solution {
    public int rob(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        int [] sum = new int[nums.length];
        sum[0] = nums[0];
        if(nums.length == 1) return sum[0];
        sum[1] = Math.max(nums[0], nums[1]);
        if(nums.length <= 2) return Math.max(sum[0], sum[1]);
        for(int i = 2; i < nums.length; i++){
            sum[i] = Math.max(sum[i-2] + nums[i], sum[i-1]);
        }
        return Math.max(sum[sum.length - 1], sum[sum.length - 2]);
    }
}