public class Solution {
    public void moveZeroes(int[] nums) {
        int tail = nums.length;
        int check = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[check] == 0){
                for(int j = check; j < tail-1; j++){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                tail --;
            }else{
                check ++;
            }
            
        }
    }
}