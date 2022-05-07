class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        ArrayList<List<Integer>> ans  = new ArrayList<List<Integer>>();
        if(nums.length == 0)
            return ans;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            int target_3 = target - nums[i];
            for(int j=i+1;j<n;j++)
            {
                
                int target_2 = target_3 - nums[j];
                int l = j+1;
                int r = n-1;
                while(l < r)
                {
                    int two_sum = nums[l] + nums[r];
                    if(two_sum < target_2)
                    {
                        l++;
                    }
                    else if(two_sum > target_2)
                    {
                        r--;
                    }
                    else
                    {
                        List<Integer> a = new ArrayList<Integer>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        ans.add(a);
                        
                        while(l<r && nums[l] == a.get(2))
                        {
                            l++;
                        }
                        while(l<r &&  nums[r] == a.get(3))
                        {
                            r--;
                        }
                        
                    }
                }
                while(j+1 < n && nums[j] == nums[j+1]) j++;
                
            }
         while(i+1 < n && nums[i] == nums[i+1]) i++;   
        }
        
        return ans;
        
    }
}