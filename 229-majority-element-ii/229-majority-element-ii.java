class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int count1 = 0;
        int count2 = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == max1) count1++;
            else if(nums[i] == max2) count2++;
            else if(count1 == 0){
                max1 = nums[i];
                count1++;
            }
            else if(count2 == 0){
                max2 = nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        int curr_c1 = 0;
        int curr_c2 = 0;
        
        
        for(int i = 0; i < n; i++){
            if(nums[i] == max1) curr_c1++;
            if(nums[i] == max2) curr_c2++;
        }
        
        if(curr_c1 > n / 3 && curr_c2 > n / 3 && max1 != max2){
            ans.add(max1);
            ans.add(max2);
            return ans;
        }
        
        if(curr_c1 > n / 3){
            ans.add(max1);
            return ans;
        }
        
        if(curr_c2 > n / 3){
            ans.add(max2);
            return ans;
        }
        
        else return ans;
    }
}