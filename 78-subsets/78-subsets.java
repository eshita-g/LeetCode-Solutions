class Solution {
    
    public void subset(List<List<Integer>> res,List<Integer> temp,int[] nums,int i)
    {
        if(i ==  nums.length)
        {
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[i]);
        subset(res,temp,nums,i+1);
        temp.remove(temp.size() -1);
        subset(res,temp,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        subset(res,temp,nums,0);
        
        return res;
        
    }
}