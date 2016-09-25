public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length<2) return null;
        int [] res = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            int temp = numbers[low]+numbers[high];
            if(temp == target){
                res[0] = low+1;
                res[1] = high+1;
                return res;
            }else if(temp < target){
                low++;
            }else{
                high--;
            }
        }
        return res;
    }
}