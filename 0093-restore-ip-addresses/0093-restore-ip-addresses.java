class Solution {
    public void helper(String s,int index,List<String> temp,List<String> res)
    {
        if(temp.size() > 4)
            return;
        if(temp.size() == 4)
        {
            int len = 0;
            for(String str:temp)
            {
                len = len + str.length();
                if(str.length() > 1 && str.charAt(0) == '0' || Integer.parseInt(str) > 255)
                    return;
                
                if(len == s.length())
                {
                    res.add(String.join(".",temp));
                }
            }
        }
        String str = "";
        for(int i=index;i<index+3 && i<s.length();i++)
        {
            str = str + s.charAt(i);
            temp.add(str);
            helper(s,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }
    public List<String> restoreIpAddresses(String s) {
        
        List<String> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        
        helper(s,0,temp,res);
        
        return res;
        
    }
}