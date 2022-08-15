class Solution {
    public List<Integer> findstr(String str)
    {
        if(str.length() <= 2)
        {
            List<Integer> ls = new ArrayList<>();
            ls.add(Integer.parseInt(str));
            return ls;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch))
            {
                String left = str.substring(0,i);
                String right = str.substring(i+1,str.length());
                List<Integer> ls1 = findstr(left);
                List<Integer> ls2 = findstr(right);
                for(Integer x1: ls1)
                {
                    for(Integer x2 : ls2)
                    {
                        if(ch == '+')
                        {
                            res.add(x1 + x2);
                        }
                        else if(ch == '-')
                        {
                            res.add(x1 - x2);
                        }
                        else if(ch == '*')
                        {
                            res.add(x1*x2);
                        }
                    }
                }
            }
        }
        return res;
    }
    public List<Integer> diffWaysToCompute(String expression) {
        
        return findstr(expression);
        
    }
}