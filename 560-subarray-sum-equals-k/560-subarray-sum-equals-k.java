class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int n  = nums.length;
        HashMap<Integer,Integer> A = new HashMap<>();
        A.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum + nums[i];
            if(A.containsKey(sum - k))
            {
                count += A.get(sum-k);
            }
            A.put(sum,A.getOrDefault(sum,0) + 1);
            
        }
        
        
        return count;
        
    }
}