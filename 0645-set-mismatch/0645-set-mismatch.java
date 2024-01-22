class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int x : nums){
            if(set.contains(x)){
               res[0] = x;
            }
            set.add(x);
        }
        int i =1;
        while(i<=nums.length){
            
            if(!set.contains(i)){
                res[1] = i;
                break;
            }
            i++;
        }
        
        return res;
        
    }
}