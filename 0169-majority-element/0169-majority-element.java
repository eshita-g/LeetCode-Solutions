class Solution {
    public int majorityElement(int[] nums) {
        
        int c = 1;
        int p = nums[0];
        for(int i=1;i<nums.length;i++)
        {   
            if(c == 0)
            {
                p = nums[i];
                c = 1;

                
            }
            else if(p == nums[i])
            {
                c++;
            }
            else
            {
                
                c--;
            }
        }
         c = 0;
        for(int i=0;i<nums.length;i++)
        {
            if( p== nums[i])
            {
                c++;
            }
        }
        
        if(c > nums.length/2)
            return p;
        
        return -1;
        
        
    }
}