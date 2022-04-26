class Solution {
    public void permute(List<List<Integer>> res,int[] nums,int i)
    {
        if(i == nums.length)
        {
            ArrayList<Integer> out = new ArrayList<>();
            for(int k=0;k<nums.length;k++)
            {
                out.add(nums[k]);
            }
            res.add(out);
            
        }
        int[] freq = new int[21];
        Arrays.fill(freq, 0);
        for(int j=i;j<nums.length;j++)
        {
            if(freq[nums[j] + 10] == 0)
            {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j] = a;
                permute(res,nums,i+1);
                int b = nums[i];
                nums[i] = nums[j];
                nums[j] = b;
            }
            freq[nums[j] + 10]++;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        permute(res,nums,0);
        return res;
        
    }
}