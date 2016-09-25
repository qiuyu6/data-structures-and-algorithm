public class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int tmax = nums[0];
        int tmin = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tmp1 =nums[i] * tmax;
            int tmp2 = nums[i] * tmin;
            
            tmax =  Math.max(tmp2,Math.max(nums[i], tmp1));
            tmin =  Math.min(tmp2,Math.min(nums[i], tmp1));
            res = Math.max(res, tmax); 
        }
        return res;
    }
}