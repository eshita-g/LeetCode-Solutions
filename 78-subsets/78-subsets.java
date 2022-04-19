class Solution {
    
    public boolean checkBit(int i,int j)
        {
            return (i>>j)%2!=0;
        }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        for(int i=0;i<(1<<nums.length);i++)
        {
            List<Integer> al = new ArrayList<>();
            for(int j=0;j<nums.length;j++)
            {
                if(checkBit(i,j))
                {
                    al.add(nums[j]);
                }
            }
            
            res.add(al);
        }
        
        return res;
    }
}