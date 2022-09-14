class Find implements Comparator<int[]>{
    
    public int compare(int[] a,int[] b)
    {
        if(a[2] > b[2])
            return 1;
        else if(a[2] < b[2])
            return -1;
        
        
        return 0;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<int[]> q = new PriorityQueue<>(new Find());
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0)
            return res;
        
        for(int i=0;i<nums1.length && i<k ;i++)
        {
            q.add(new int[]{i,0,nums1[i] + nums2[0]});
        }
        while(k-- > 0 && !q.isEmpty())
        {
            int[] top = q.poll();
            int i = top[0];
            int j = top[1];
            res.add(Arrays.asList(nums1[i],nums2[j]));
            if(j+1 == nums2.length)
                continue;
            q.add(new int[]{i,j+1,nums1[i]+nums2[j+1]});
        }
        
        return res;
        
    }
}