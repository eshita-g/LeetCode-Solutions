class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> res = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            res.add(nums[i]);
            if(res.size() > k)
            {
                res.poll();
            }
        }
        
       return res.peek();
    }
}