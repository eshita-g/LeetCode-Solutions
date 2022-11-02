class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int res= Integer.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            int first = nums[i];
            int l = i + 1;
            int r = n-1;
            
            while(l < r)
            {
                int sum = first + nums[l] + nums[r];
                if(Math.abs(target - sum) < res)
                {
                    res = Math.abs(target - sum);
                    ans = sum;
                }
                if(sum > target)
                {
                    r--;
                }
                else if(sum < target)
                {
                    l++;
                }
                else
                {
                    break;
                }
                
            }
        }
        
        return ans;
        
    }
}