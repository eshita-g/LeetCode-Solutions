class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pref;
        pref = new int[n];
        int[] suf;
        suf = new int[n];
        pref[0] = height[0];
        suf[n-1] = height[n-1];
        for(int i=1;i<n;i++)
        {
            pref[i] = Math.max(height[i],pref[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            suf[i] = Math.max(height[i],suf[i+1]);
        }
        int c = 0;
        for(int i = 1;i<n-1;i++)
        {
            int l = pref[i-1];
            int r = suf[i+1];
            int d = Math.min(l,r);
            if(d > height[i])
            {
                c = c + (d - height[i]);
            }
        }
        
        return c;
    }
}