class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums.length == 0)
        {
            return new int[k];
            
        }
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(int n : freq.keySet())
        {
            q.add(new int[]{n,freq.get(n)});
            
        }
        int[] res = new int[k];
        int i =0;
        while(i<k)
        {
            
            res[i] = q.poll()[0];
            i++;
        }
        
        return res;
        
    }
}