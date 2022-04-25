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
        for(int j=i;j<nums.length;j++)
        {
            int a = nums[i];
            nums[i] = nums[j];
            nums[j]  = a;
            permute(res,nums,i+1);
            int b = nums[i];
            nums[i] = nums[j];
            nums[j] = b;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(res,nums,0);
        return res;
        
    }
}