public class Solution {
    public boolean containsDuplicate(int[] nums) {
        // boolean res = false;
        // for(int i = nums.length-1; i >= 0; i-- ){
           // for(int j = 0; j < i; j++){
             //       if(nums[i] == nums[j]){
               //         res = true;
                 //       return res;
                   // }
                //}
            //}
        //return res;
        
        HashSet hash = new HashSet();
        for(int i = 0; i < nums.length; i++){
            hash.add(nums[i]);
        }
        
        if(hash.size() == nums.length){
            return false;
        }else{
            return true;
        }
    
    }
}