class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int target2 = 0 - nums[i];
            int l = i+1;
            int r = n-1;
            while(l<r)
            {
                if((nums[l] + nums[r]) < target2)
                {
                    l++;
                }
                else if((nums[l] + nums[r]) > target2)
                {
                    r--;
                }
                else
                {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[l]);
                    a.add(nums[r]);
                    res.add(a);
                    while(l<r && nums[l] == a.get(1))
                    {
                        l++;
                    }
                    while(l<r && nums[r] == a.get(2))
                    {
                        r--;
                    }
                }
            }
            while(i+1 < n && nums[i+1] == nums[i])
            {
                i++;
            }
        }
        
        return res;
    }
}