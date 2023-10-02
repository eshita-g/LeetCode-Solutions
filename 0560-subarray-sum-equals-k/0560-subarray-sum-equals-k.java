class Solution {
    public int subarraySum(int[] nums, int k) {
        
       int n = nums.length;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int res = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
                  
            sum = sum + nums[i];
            if(mp.containsKey(sum - k)){
                res = res + mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0) + 1);
        }
     
      return res;
    }
    
    
}