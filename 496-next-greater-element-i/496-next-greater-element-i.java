class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> A = new HashMap();
         Stack<Integer> B=new Stack();
        for(Integer nums : nums2)
        {
            while(!B.empty() && B.peek()<nums)
            {
                A.put(B.pop(),nums);
            }
            B.push(nums);
        }
        while(!B.empty())
        {
            A.put(B.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i] = A.get(nums1[i]);
        }
        
        return nums1;
        
    }
}