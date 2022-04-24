class Solution {
    public void comb(List<List<Integer> > res,ArrayList<Integer> out,int n,int k,int index)
    {
        if(out.size() == k)
        {
            res.add(new ArrayList<>(out));
            return;
        }
        for(int i=index;i<=n;i++)
        {
            out.add(i);
            comb(res,out,n,k,i+1);
            out.remove(out.size() - 1);
        }
        
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer> > res = new ArrayList<> ();
        comb(res,new ArrayList<>(), n,k,1);
        return res;
        
    }
}