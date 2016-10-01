public class Solution {
    public String countAndSay(int n) {
        String res = "";
        String start = "1";
        int count = 0;
        if(n == 1) return start;
        while(n > 1){
            char c = '1';
            res = "";
            for(int i = 0; i < start.length(); i++){
                if(i == 0){
                    c = start.charAt(i);
                    count = 1;
                }else if(start.charAt(i) == start.charAt(i-1)){
                    count++;
                }else{
                    res = res + count + c;
                    c = start.charAt(i);
                    count = 1;
                }
            }
            res = res + count + c; 
            n--;
            start = res;
        }
        return res;
    }
}