public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 1 && nums[0] != target){
            if(nums[0] < target) return 1;
            else return 0;
        }
        int low = 0;
        int high = nums.length - 1;
        int mid = low + (high - low)/2;
        
        while(low <= high){
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) low = mid + 1;
            if(nums[mid] > target) high = mid - 1;
            mid = low + (high - low)/2;
        }
        return low;
    }
}