class Solution {
    
    int count = 0;
    public int countArrangement(int n) {
        
        boolean[] vis = new boolean[n+1];
        permute(1,vis,n);
        
        return count;
    }
    
    public void permute(int pos,boolean[] vis,int n)
    {
        if(pos > n)
            count++;
        for(int i=1;i<=n;i++)
        {
            if(!vis[i] && (i%pos == 0 || pos%i == 0))
            {
                vis[i] = true;
                permute(pos+1,vis,n);
                vis[i] = false;
            }
        }
        
    }
}