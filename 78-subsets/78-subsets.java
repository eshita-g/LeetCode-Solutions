class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList();
        recurse(ans,temp,nums,0);
        
        return ans;
        
        
    }
    
    public void recurse(List<List<Integer>> ans,ArrayList <Integer> temp,int[] nums,int index)
    {
        if(index == nums.length)
        {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[index]);
        recurse(ans,temp,nums,index+1);
        temp.remove(temp.size() - 1);
        recurse(ans,temp,nums,index+1);
    }
}