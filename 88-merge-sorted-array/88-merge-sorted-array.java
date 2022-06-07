class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> res =  new ArrayList<>();
        int j=0;
        int k = 0;
        while(j<m && k<n)
        {
            if(nums1[j] < nums2[k])
            {
                res.add(nums1[j]);
                j++;
            }
            else
            {
                res.add(nums2[k]);
                k++;
            }
        }
        while(j<m)
        {
            res.add(nums1[j]);
            j++;
        }
        while(k<n)
        {
            res.add(nums2[k]);
            k++;
        }
        int t = res.size();
        for(int i=0;i<t;i++)
        {
            nums1[i] = res.get(i);
        }
        
    }
}