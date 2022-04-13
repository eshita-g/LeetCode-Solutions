class Solution {
    public int arrayNesting(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int n = nums.length;
        int c = 0;
        int global = 0;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {     
            c = 1;
            int index = nums[i];
            int val = i;
            while(index != i)
            {
                val = index;
                index = nums[index];
                c++;
                visited[val] = true;
            }
               visited[i] = true; 
            }    
            global = Math.max(global,c);
        }
        
        return global;
        
    }
}