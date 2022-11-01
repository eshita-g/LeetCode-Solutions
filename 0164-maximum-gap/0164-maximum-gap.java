class Solution {
    public int maximumGap(int[] nums) {
        
        int n = nums.length;
        if(n < 2)
            return 0;
        
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            maxNum = Math.max(maxNum,nums[i]);
            minNum = Math.min(minNum,nums[i]);
        }
        if(minNum == maxNum)
            return 0;
        
        int gap = (maxNum - minNum) / (n-1);
        
        if((maxNum - minNum) % (n-1) != 0)
            gap++;
        
        int[] maxArr = new int[n];
        int[] minArr = new int[n];
        Arrays.fill(maxArr,Integer.MIN_VALUE);
        Arrays.fill(minArr,Integer.MAX_VALUE);
        for(int i=0;i<n;i++)
        {
            int bkt = (nums[i] - minNum)/gap;
            
            minArr[bkt] = Math.min(nums[i],minArr[bkt]);
            maxArr[bkt] = Math.max(nums[i],maxArr[bkt]);
            
        }
        int res = Integer.MIN_VALUE;
        int prev = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(minArr[i] == Integer.MAX_VALUE)
            {
                continue;
            }
            if(prev == Integer.MAX_VALUE)
            {
                prev = maxArr[i];
            }
            else
            {
                res = Math.max(res,minArr[i] - prev);
                prev = maxArr[i];
            }
        }
        
        return res;
        
    }
}