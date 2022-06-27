class Solution {
    public int firstMissingPositive(int[] nums) {
        
        int min = 1;
        boolean minChanged = true;
		
        while (minChanged) {
            minChanged = false;
            for (int num : nums) {
                if (min == num) {
                    min++;
                    minChanged = true;
                }
            }
        }

        return min;
        
    }
}