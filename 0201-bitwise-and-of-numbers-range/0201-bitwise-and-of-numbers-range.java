class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        
        long x = 1L;
        long ans = 0;
        long mask = (x << 31);
        
        while(mask != 0)
        {
            if((mask & left) == (mask & right))
            {
                if((mask & left ) != 0)
                {
                    ans = ans + mask;
                }
                
                mask = (mask >> 1);
            }
            else
            {
                break;
            }
        }
        
        return (int)ans;
        
    }
}