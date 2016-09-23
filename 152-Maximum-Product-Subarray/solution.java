public class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int tmax = nums[0];
        int tmin = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = tmax;
                tmax = tmin;
                tmin = temp;
            }
            tmax = Math.max(nums[i], nums[i] * tmax);
            tmin = Math.min(nums[i], nums[i] * tmin);
            res = Math.max(res, tmax); 
        }
        return res;
    }
}