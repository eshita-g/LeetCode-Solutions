class Solution {
    int ans = 0;
    public int helper(ArrayList<Integer> res,int i,int k)
    {
        if(res.size() == 1)
        {
            ans = res.get(0);
            return ans;
        }
        i = (i + k) % res.size();
        res.remove(i);
        return helper(res,i,k);
    }
    public int findTheWinner(int n, int k) {
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            res.add(i);
        }
        return helper(res,0,k-1);
    }
}