class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stk = new Stack<>();
        int n = tokens.length;
        for(int i=0;i<n;i++)
        {
            if(tokens[i].equals("+"))
            {
                stk.add(stk.pop() + stk.pop());
            }
            else if(tokens[i].equals("-"))
            {
                int b = stk.pop();
                int a = stk.pop();
                stk.add(a-b);
            }
            else if(tokens[i].equals("*"))
            {
                stk.add(stk.pop() * stk.pop());
            }
            else if(tokens[i].equals("/"))
            {
                int b = stk.pop();
                int a = stk.pop();
                
                stk.add(a/b);
            }
            else
            {
                stk.add(Integer.parseInt(tokens[i]));
            }
        }
        
        int res = stk.pop();
        
        return res;
    }
}