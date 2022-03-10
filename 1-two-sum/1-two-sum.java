class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        HashMap<Integer,Integer> A = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(A.containsKey(target - nums[i]))
                return new int[]{A.get(target - nums[i]),i};
            else
                A.put(nums[i],i);
            
        }
        return new int[]{-1,-1};
        
    }
}