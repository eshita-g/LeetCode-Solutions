class Solution {
public:
    int fab(int t)
    {   
        if(t==0)
            return 0;
        if(t==1 || t==2)
            return 1;
        return fab(t-1)+fab(t-2);
    }
    int fib(int n) {
        int p;
        p = fab(n);
        
        return p;
    }
    
    
};