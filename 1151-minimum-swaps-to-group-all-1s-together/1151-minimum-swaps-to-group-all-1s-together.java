class Solution {
    public int minSwaps(int[] data) {
        int n = data.length;
        int legal = 0;
        for(int i=0;i<n;i++)
        {
            if(data[i] == 1)
            {
                legal++;
            }
        }
        if(legal == 1)
            return 0;
        //System.out.println(legal);
        int count = 0;
        int global = 0;
        int i=0;
        int j=0;
        while(i<n && j<n)
        {
            if(j-i+1 <= legal)
            {
                if(data[j] == 1)
                {
                    count++;
                }
                j++;

            }
            else
            {
                global = Math.max(global,count);
                if(data[i] == 1)
                {
                    count--;
                }
                i++;
            }
        }
        global = Math.max(global,count);

        return legal-global;
        
        
    }
}