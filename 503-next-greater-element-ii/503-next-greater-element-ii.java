class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            while(!stk.isEmpty() && nums[i] > nums[stk.peek()])
            {
                res[stk.peek()] = nums[i];
                stk.pop();
            }
            stk.push(i);
        }
        for(int i=0;i<nums.length;i++)
        {
            while(!stk.isEmpty() && nums[i] > nums[stk.peek()])
            {
                res[stk.peek()] = nums[i];
                stk.pop();
            }
            
        }
        while(!stk.isEmpty())
        {
            res[stk.peek()] = -1;
            stk.pop();
        }
        
        return res;
    }
}