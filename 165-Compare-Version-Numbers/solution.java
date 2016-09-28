public class Solution {
    public int compareVersion(String version1, String version2) {
         
        int first = 0;
        int second = 0;
        int i = 0;
        int j = 0;
        while(i < version1.length() || j < version2.length()){
            while(i < version1.length() && version1.charAt(i) != '.'){
                int temp = version1.charAt(i) - '0';
                first = first * 10 + temp;
                i++;
            }
            while(j < version2.length() && version2.charAt(j) != '.'){
                int temp = version2.charAt(j) - '0';
                second = second * 10 + temp;
                j++;
            }
            if(first < second) return -1;
            else if(first > second) return 1;
            else{
                i++;
                j++;
                first = 0;
            second = 0;
            }
            
        }
        
        
        
        return 0;
            
        
    }
}