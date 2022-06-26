class Solution {
    public void insertAt(int[] nums,Deque<Integer> d,int i)
    {
        while(d.size()!=0 && nums[i] >= nums[d.peekLast()])
        {
            d.removeLast();
        }
        d.addLast(i);
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n  = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> d = new LinkedList<>();
        int p = 0;
        for(int i=0;i<k;i++)
        {
            insertAt(nums,d,i);
        }
        for(int i=k;i<n;i++)
        {
            res[p] = nums[d.peekFirst()];
            if(d.peekFirst() == i-k)
            {
                d.removeFirst();
            }
            insertAt(nums,d,i);
            p++;
        }
        res[p] = nums[d.peekFirst()];
        
        return res;
    }
}