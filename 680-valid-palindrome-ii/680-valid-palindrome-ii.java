class Solution {
    public boolean validPalindrome(String s) {
        
        int n = s.length();
        int flag = 0;
        int i =0;
        int j = n-1;
        while(i<j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else return isPal(s,i+1,j) || isPal(s,i,j-1);
            
            
           
        }
        
        return true;
        
    }
    
    public boolean isPal(String s,int i,int j)
    {
        while(i<=j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}