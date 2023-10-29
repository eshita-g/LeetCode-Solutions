class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int result = 0;
        for(int i=0;i<n;i++){
            
            if((set.contains(nums[i] - diff)) && (set.contains(nums[i] + diff))){
                result++;
            }
        }
        
        return result;
    }
}