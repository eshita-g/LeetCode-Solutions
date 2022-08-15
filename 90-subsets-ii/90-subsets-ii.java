class Solution {
    public void subset(List<List<Integer>> res,List<Integer> temp,int[] nums,int i)
    {
        if(i == nums.length)
        {
            ArrayList<Integer> p = new ArrayList<>(temp);
            if(!res.contains(p))
            {
                res.add(p);
            }
            return;
        }
        temp.add(nums[i]);
        subset(res,temp,nums,i+1);
        temp.remove(temp.size() - 1);
        subset(res,temp,nums,i+1);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset(res,temp,nums,0);
        
        return res;
    }
}