class Solution {
    public void func(int index,String s,List<String> temp,List<List<String>> res)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(temp));
            return;    
        }
        for(int i=index;i<s.length();i++)
        {
            if(isPallindrome(s,index,i))
            {
                temp.add(s.substring(index,i+1));
                func(i+1,s,temp,res);
                temp.remove(temp.size() - 1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        func(0,s,temp,res);
        
        return res;
        
        
    }
    public boolean isPallindrome(String s,int start,int end)
    {
        while(start<=end)
        {
            if(s.charAt(start) != s.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}