class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> A = new HashMap<>();
        int maxlen = 0;
        int count = 0;
        A.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            count += (nums[i] == 1)?1:-1;
            if(A.containsKey(count))
            {
                maxlen = Math.max(maxlen,i-A.get(count));
            }
            else
            {
                A.put(count,i);
            }
            
        }
        
        return maxlen;
        
    }
}