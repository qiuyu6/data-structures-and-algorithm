public class Solution {
    public boolean isHappy(int n) {
        if(n < 0) return false;
        Set<Integer> s = new HashSet<Integer>();
        int num = n;
        while(num != 1){
            int sum = 0;
            while(num > 0){
                int dig = num%10;
                sum = sum + dig * dig;
                num = num / 10;
            }
            //if(sum == 1) return true;
            if(s.contains(sum)) return false;
            else{
                s.add(sum);
                
            }
            num = sum;    
        }
        
        return true;
    }
}