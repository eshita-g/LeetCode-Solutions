class Solution {
    public int minimumOperations(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                
                set.add(nums[i]);
            }
        }
        
        return set.size();
        
    }
}