class Solution {
    public int func(int index,String s,int[] temp)
    {
        if(index == s.length())
        {
            return 0;    
        }
        if(temp[index] != -1 )
            return temp[index];
        
        int minValue  = Integer.MAX_VALUE;

        for(int i=index;i<s.length();i++)
        {
            if(isPallindrome(s,index,i))
            {
                
                int cuts = 1 + func(i+1,s,temp);
                minValue = Math.min(cuts,minValue);
            
            }
        }
        temp[index] = minValue;
        
        return temp[index];
        
    }
    public int minCut(String s) {
        

        int n = s.length();
        int[] temp = new int[n];
        Arrays.fill(temp,-1);
        return func(0,s,temp)-1;
        

        
    
        
        
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