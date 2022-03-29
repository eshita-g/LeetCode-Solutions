class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            A.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            B.add(nums2[i]);
        }
        List<List<Integer> > aList = new ArrayList<List<Integer> >(2);
        
        aList.add(new ArrayList<>());
        aList.add(new ArrayList<>());
        for(int i:A)
        {
            if(!B.contains(i))
            {
                aList.get(0).add(i);
            }
        }
        
        for(int i: B)
        {
            if(!A.contains(i))
            {
                aList.get(1).add(i);
            }
            
        }
        
        
        
        
        return aList;
        
        
        
        
    }
}