class Solution {
    public void rotate(int[] nums, int k) {
        
        
        
        if(nums.length==1)return;
        int kr = k%(nums.length);
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, kr-1);
        reverse(nums, kr, nums.length-1);
        return;
    }
    
    
    public void reverse(int[] arr, int start, int end){
        
       
        int s = start;
        int e = end;
        int temp =0;
        
        while(s<e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        
    }
        
    }
