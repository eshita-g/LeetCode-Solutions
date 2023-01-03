class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        if(n == 1)
        {
            return new int[]{1,2,3,4,5,6,7,8,9};
        }
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=1;i<=9;i++)
        {
            dfs(n,k,1,i,res,set);
        }
        int[] ans =  new int[res.size()];
        for(int i=0;i<res.size();i++)
        {
            ans[i] = res.get(i);
        }
        return ans;
    }
    public void dfs(int n,int k,int idx,int cur,List<Integer> res,HashSet<Integer> set)
    {
        if(set.contains(cur))
            return;
        
        set.add(cur);
        
        if(idx == n)
        {
            res.add(cur);
            return;
        }
        
        int rem = cur % 10;
        if(rem + k < 10)
        {
            dfs(n,k,idx+1,cur*10 + rem + k,res,set);
        }
        if(rem - k >= 0)
        {
            dfs(n,k,idx+1,cur*10 + rem - k,res,set);
        }
    }
}