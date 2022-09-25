class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        HashSet<Integer> set = new HashSet<>();
        int n = days.length;
        for(int i=0;i<n;i++)
        {
            set.add(days[i]);
        }
        int[] res = new int[366];
        Arrays.fill(res,0,366,-1);

        
        return dp(1,res,costs,set);
    }
    public int dp(int i,int[] res,int[] costs,HashSet<Integer> set)
    {
        if(i> 365)
            return 0;
        if(res[i] != -1)
            return res[i];
        
        int ans;
        if(set.contains(i))
        {
            ans = Math.min((dp(i+1,res,costs,set) + costs[0]), (dp(i+7,res,costs,set) +costs[1]));
            ans = Math.min(ans,dp(i+30,res,costs,set) + costs[2]);
            System.out.println(ans);
        }
        else
        {
           ans =  dp(i+1,res,costs,set);
        }
        
        res[i] = ans;
        
        return res[i];
    }
}