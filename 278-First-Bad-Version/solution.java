/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(isBadVersion(1)) return 1;
        
        int low = 2;
        int high = n;
        int mid = low + (high - low)/2;
        while(low < high){
            if(isBadVersion(mid) && !isBadVersion(mid-1)) return mid;
            if(isBadVersion(mid) && isBadVersion(mid-1)) high = mid - 1;
            if(!isBadVersion(mid) && !isBadVersion(mid-1)) low = mid + 1;
            mid = low + (high - low)/2;
        }
        return mid;
    }
}