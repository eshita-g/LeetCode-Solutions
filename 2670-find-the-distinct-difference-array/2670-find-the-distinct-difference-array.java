class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int n = nums.length;
        int[] left = new int[n];
        
        for(int i=0;i<n;i++){
            setA.add(nums[i]);
            left[i] = setA.size();
        }
        
        for(int i=n-1;i>=0;i--){
           
            left[i] = left[i] - setB.size();
             setB.add(nums[i]);
        }
        
        return left;
    }
}