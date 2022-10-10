class Solution {
    public String breakPalindrome(String palindrome) {
        
        int n = palindrome.length();
        if(n == 1)
            return "";
        int i = 0;
        int j = n-1;
        int index = -1;
        while(i < j)
        {
            if(palindrome.charAt(i) != 'a')
            {
                index = i;
                break;
            }
            i++;
            j--;
        }
        String res = "";
        if(index == -1)
        {
            res = palindrome.substring(0,n-1) + 'b';
        }
        else
        {
            res = palindrome.substring(0,index) + 'a' + palindrome.substring(index+1);
        }
        
        return res;
        
    }
}