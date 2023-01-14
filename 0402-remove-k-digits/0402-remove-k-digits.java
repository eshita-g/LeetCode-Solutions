class Solution {
    public String removeKdigits(String num, int k) {
        
        if(k==0)
            return num;
        
        int n = num.length();
        
        if(n <= k)
            return "0";
        
        Stack<Character> stk = new Stack<>();
        int i = 0;
        while(i < n)
        {
            while(!stk.isEmpty() && k > 0 && stk.peek() > num.charAt(i))
            {
                k--;
                stk.pop();
            }
            stk.push(num.charAt(i));
            i++;
        }
        while(k > 0)
        {
            stk.pop();
            k--;
        }
        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty())
        {
            res.append(stk.pop());
        }
        String str = res.reverse().toString();
        while(str.length() > 1 && str.charAt(0) == '0')
        {
            str = str.substring(1);
        }
        
        return str;
    }
}