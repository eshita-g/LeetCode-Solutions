class Solution {
    public void recurse(int index,int k,int n,List<Integer> temp,List<List<Integer>> res)
    {
        if(temp.size() == k)
        {
            if(n==0)
            {
                res.add(new ArrayList<>(temp));
            }
            return;
        }
        for(int i=index;i<=9;i++)
        {
            if(n-i >=0 )
            {
                temp.add(i);
                recurse(i+1,k,n-i,temp,res);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        recurse(1,k,n,temp,res);
        
        return res;
        
    }
}