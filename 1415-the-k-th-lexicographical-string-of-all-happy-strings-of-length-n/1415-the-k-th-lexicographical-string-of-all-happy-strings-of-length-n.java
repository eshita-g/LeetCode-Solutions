class Solution {
    public void recurse(List<String> res,int n,int k,StringBuilder temp)
    {
        if(res.size() == k)
            return;
        
        if(temp.length() == n)
        {
            res.add(temp.toString());
            return;
        }
        for(char ch = 'a';ch<='c';ch++)
        {
            if(temp.length() > 0 && temp.charAt(temp.length() - 1) == ch)
                continue;
            
            temp.append(ch);
            recurse(res,n,k,temp);
            temp.deleteCharAt(temp.length() - 1);
            
        }
    }
    public String getHappyString(int n, int k) {
        
        
        StringBuilder temp = new StringBuilder();
        List<String> res = new ArrayList<>();
        recurse(res,n,k,temp);
        
        if(res.size() < k)
            return "";
        
        return res.get(k-1);
        
    }
}