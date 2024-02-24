class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        helper(res,nums,0,new ArrayList<>(),Integer.MIN_VALUE);
        
        return res;
        
        
    }
    
    public void helper(List<List<Integer>> res,int[] nums,int i,List<Integer> temp,int prev){
        
        
        if((i >= nums.length)){
            if(temp.size() > 1){
            res.add(new ArrayList<>(temp));
            }
            return;
        }
        if(nums[i] >= prev){
            temp.add(nums[i]);
            helper(res,nums,i+1,temp,nums[i]);
            temp.remove(temp.size()-1);
           
        }
        if(nums[i] == prev)
            return;
        helper(res,nums,i+1,temp,prev);
        
        
    }
}