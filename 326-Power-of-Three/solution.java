public class Solution {
    public boolean isPowerOfThree(int n) {
        int resi = 0;
        int rema = n;
        boolean isPower = true;
        if(rema == 0) isPower = false;
        else if(rema == 1) isPower = true;
            else{
                while(rema != 1){
                resi = rema % 3;
                if(resi != 0) {
                    isPower = false;
                    break;
                }
                rema = rema/3;
                isPower = true;    
            
                }
            }
        
        return isPower;
    }
}