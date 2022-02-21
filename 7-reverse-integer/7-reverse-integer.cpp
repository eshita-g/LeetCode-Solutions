class Solution {
public:
    int reverse(int x) {
        bool neg = false;
        if( x < 0)
        {
           neg = true; 
            x = abs(x);
        }
        int rev = 0;
        while(x != 0)
        {  int rem  = x % 10;
           if(rev > INT_MAX/10 || (rev == INT_MAX/10  && rem > 7)) 
           {
               return 0;
           }
           if(rev < INT_MIN/10 || (rev == INT_MIN/10 && rem < -8) ) 
           {
               return 0;
           }
            
            rev = rev*10 + rem;
            x = x/10;
        }
        if(neg == true)
            return (-rev);
        
        return rev;
        
    }
};