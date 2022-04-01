class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        int i =0;
        int  j = n-1;
        char c;
        while(i<j)
        {
           c = s[i];
            s[i] = s[j];
            s[j] = c;
            i++;
            j--;
        }
        
    }
}