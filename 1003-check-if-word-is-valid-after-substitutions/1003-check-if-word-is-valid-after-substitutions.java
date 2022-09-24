class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<>();
        stk.push('a');
        stk.push('b');
        stk.push('c');
        if(s.length() ==0)
            return true;
        
        int i = s.length() - 1;
        int c = 0;
        while(i>=0)
        {
            if(!stk.isEmpty() && stk.peek() == s.charAt(i))
            {
                stk.pop();
                i--;
            }
            else
            {
                        stk.push('a');
                        stk.push('b');
                        stk.push('c');
                c = c+ 3;

                if(c > s.length())
                    return false;

            }
        }
        if(stk.isEmpty() && i==-1)
            return true;
        
        return false;
        
        
    }
}