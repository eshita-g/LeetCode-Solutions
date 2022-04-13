class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int c1 = 0;
        int max1 = 0;
        int max2 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == max1)
            {
                c1++;
                
            }
            else if(nums[i] == max2)
            {
                c2++;
            }
            else if(c1 == 0)
            {
               max1 = nums[i];
                c1++;   
            }
            else if(c2 == 0)
            {
                max2 = nums[i];
                c2++;
                
            }
            else
            {
              c1--;
              c2--;  
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        int a = 0;
        int b = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == max1) a++;
            if(nums[i] == max2) b++;
            
                
        }
        if(a>n/3 && b>n/3 && max1!=max2)
        {
            ans.add(max1);
            ans.add(max2);
            return ans;
        }
        if(a>n/3)
        {
            ans.add(max1);
            return ans;
        }
        if(b>n/3)
        {
            ans.add(max2);
            return ans;
        }
        
        else return ans;
        
    }
}