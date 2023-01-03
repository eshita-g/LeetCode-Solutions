class Solution {
    public void part(char[] res,int l,int r,ArrayList<String> ans,int i,int n)
    {
        if(i == 2*n)
        {
            
            ans.add(new String(res));
            return;
        }
        if(l == r)
        {
            res[i] = '(';
            part(res,l+1,r,ans,i+1,n);
        }
        else if(l > r)
        {
            if( l == n)
            {
                res[i] = ')';
                part(res,l,r+1,ans,i+1,n);
            }
            else
            {
                res[i] = '(';
                part(res,l+1,r,ans,i+1,n);
                res[i] = ')';
                part(res,l,r+1,ans,i+1,n);
            }
        }
    }
    public List<String> generateParenthesis(int n) {
        
        ArrayList<String> ans = new ArrayList<>();
        int i =0;
        int l =0;
        int r = 0;
        char[] res = new char[2*n];
        part(res,l,r,ans,i,n);
        
        return ans;
        
    }
}