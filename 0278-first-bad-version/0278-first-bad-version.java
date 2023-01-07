/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        long low = 1;
         long high  = n;
        
        while(low <= high)
        {
            long mid = (low + high)/2;
            
            if(isBadVersion((int)mid))
            {
                if(isBadVersion((int)mid) != isBadVersion((int)mid-1))
                    return (int) mid;
                else
                    high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        
        return 0;
    }
}