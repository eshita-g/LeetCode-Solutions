class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int  sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            int rem = sum % k;
            if(rem < 0)
                rem = rem + k;
            if(map.containsKey(rem))
            {
                count = count + map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        
        return count;
        
        
    }
}