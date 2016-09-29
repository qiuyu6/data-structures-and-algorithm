public class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(table.containsKey(nums[i])){
                int temp = table.get(nums[i]) + 1;
                table.remove(nums[i]);
                table.put(nums[i], temp);
            }else{
                table.put(nums[i], 1);
            }
        }
        int red = 0;
        if(table.containsKey(0)) red = table.get(0);
        int white = 0;
        if(table.containsKey(1)) white = table.get(1);
        int blue = 0;
        if(table.containsKey(2)) blue = table.get(2);
        int j = 0;
        while(red > 0){
            nums[j] = 0;
            red--;
            j++;
        }
        while(white > 0){
            nums[j] = 1;
            white--;
            j++;
        }
        while(blue > 0){
            nums[j] = 2;
            blue--;
            j++;
        }
    }
}