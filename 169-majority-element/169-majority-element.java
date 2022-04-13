class Solution {
    public int majorityElement(int[] nums) {
        
        int n = nums.length;
        int c = 0;
        int cand = 0;
        for(int i=0;i<n;i++)
        {
            if(c == 0)
            {
                cand = nums[i];
                c++;
            }
            else if(cand == nums[i])
            {
                
                c++;
                
            }
            else
            {
                c--;
            }
        }
        c=0;
        int p =0;
        for(int i=0;i<n;i++)
        {
            if(cand == nums[i])
            {
                p++;
            }
        }
        if(p>n/2)
            return cand;
        
        return -1;
        
    }
}