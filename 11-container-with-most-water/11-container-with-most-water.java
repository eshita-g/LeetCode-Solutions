class Solution { 
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0;
        int j =n-1;
        int vol = 0;
        while(i<j )
        {
            int cur_vol = Math.min(height[i],height[j]);
            cur_vol = cur_vol * ( j - i);
            if(cur_vol > vol)
                vol = cur_vol;
            
            if(height[i] < height[j])
                i++;
            else
            {
                j--;
            }
        }
        
        return vol;
        
    }
}