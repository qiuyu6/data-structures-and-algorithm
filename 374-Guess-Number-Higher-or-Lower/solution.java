/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int res = 0;
        int low = 1;
        int high = n;
        int mid = low + (high - low)/2;
        while(guess(mid) != 0){
            if(guess(mid) == -1) high = mid - 1;
            else low = mid + 1;
            mid = low + (high - low)/2;
        }
        
        return mid;
        
    }
}