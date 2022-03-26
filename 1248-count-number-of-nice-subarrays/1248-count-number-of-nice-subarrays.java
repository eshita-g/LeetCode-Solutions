class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer,Integer> A = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2 == 0)
            {
                nums[i] = 0;
            }
            else
            {
                nums[i] = 1;
            }
        }
        int sum = 0;
        int count = 0;
        A.put(0,1);
        for(int i=0;i<n;i++)
        {
          sum = sum + nums[i];
          if(A.containsKey(sum - k))
          {
              count = count + A.get(sum - k);
          }
          A.put(sum,A.getOrDefault(sum,0) + 1);  
          
        }
        
        return count;
    }
}