public class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        int i = 0;
        int j = 1;
        while(j < nums.length){
            while(nums[i] == nums[j]){
                j++;
                if(j >= nums.length) return res;
            }
            nums[i+1] = nums[j];
            j++;
            i++;
            res++;
        }
        return res;        
    }
}