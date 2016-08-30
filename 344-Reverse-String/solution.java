public class Solution {
    public String reverseString(String s) {
        int left = 0;
        int right = s.length()-1;
        char [] res = s.toCharArray();
        while(left < right){
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
        String str = new String(res);
        return str;
    }
}