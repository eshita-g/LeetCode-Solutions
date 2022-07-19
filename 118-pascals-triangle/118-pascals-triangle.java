class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> cur, pre = null;
        for(int i=0;i<numRows;i++)
        {
             cur = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j ==0 || j==i)
                {
                    cur.add(1);
                }
                else
                {
                    cur.add(pre.get(j) + pre.get(j-1));
                }
                
            }
            pre = cur;
            res.add(cur);
        }
        
        return res;
    }
}