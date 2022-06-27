class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int res = 0;
        int n = nums.length;
        Deque<Integer> min = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        for(int i=0,j=0; j<n;j++)
        {
            while(min.size()!=0 && nums[j] < nums[min.peekLast()])
            {
                min.removeLast();
            }
            while(max.size()!=0 && nums[j] > nums[max.peekLast()])
            {
                max.removeLast();
            }
            min.add(j);
            max.add(j);
            while(nums[max.peekFirst()] - nums[min.peekFirst()] > limit)
            {
                if(min.peekFirst() == i)
                {
                    min.removeFirst();
                }
                if(max.peekFirst() == i)
                {
                    max.removeFirst();
                    
                }
                i++;
            }
            res = Math.max(res,j-i+1);
        }
        return res;
        
    }
}