class Solution {
    public int scoreOfParentheses(String s) {
        
        int d = 0,sum = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
                d++;
            else
            {
                d--;
                if(s.charAt(i-1) == '(')
                {
                    sum += Math.pow(2, d);
                }
            }
        }
        return sum;
    }
}