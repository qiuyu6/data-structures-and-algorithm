public class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0 || nums.length == 0) return;
        int p = k;
        if(k > nums.length) p = k % nums.length;
        invert(0, nums.length-1, nums);
        invert(0, p-1, nums);
        invert(p, nums.length-1, nums);
    }
    
    public void invert(int left, int right, int [] nums){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}