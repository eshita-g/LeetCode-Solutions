class FindSumPairs {

    int[] nums1;
    int[] nums2;
    HashMap<Integer,Integer> A = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        
        this.nums1 = nums1;
        this.nums2 = nums2;
        for(int num : nums2) 
        { // put all the num and the freq of num in nums2[] array in a hashmap
            A.put(num, A.getOrDefault(num, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        
        A.put(nums2[index], A.getOrDefault(nums2[index], 0) - 1); 
        nums2[index] += val;
        A.put(nums2[index], A.getOrDefault(nums2[index], 0) + 1);
       
        
    }
    
    public int count(int tot) {
        
        int res = 0;
        for(int num : nums1)
        {
            res = res + A.getOrDefault(tot-num,0);
        }
        
        return res;
        
        
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */