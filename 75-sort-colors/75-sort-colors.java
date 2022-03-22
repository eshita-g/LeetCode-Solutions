class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int n = nums.length;
        int high = n -1;
        int mid = 0;
        int temp = 0;
        while(mid <= high)
        {
            switch(nums[mid])
            {
                case 0:
                    {   
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    mid++;
                    low++;
                    break;
                    }     
                case 1:
                    {
                        mid++;
                        break;
                    }
                case 2:
                    {
                        temp = nums[mid];
                        nums[mid] = nums[high];
                        nums[high] = temp;
                        high--;
                        break;
                    }
                    
            }
        }
        
       
        
    }
}