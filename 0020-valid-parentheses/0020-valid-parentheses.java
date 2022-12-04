class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i =0;
        while(i<n)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'|| s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(st.isEmpty())
                    return false;
                else if(s.charAt(i) == ')' && st.peek() != '(')
                {
                    return false;
                }
                else if(s.charAt(i) == '}' && st.peek() != '{')
                {
                    return false;
                }
                else if(s.charAt(i) == ']' && st.peek() != '[')
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
            i++;
        }
        if(!st.isEmpty())
            return false;
        
        return true;
        
    }
}