class Solution {
    double getPow(double x,int n)
    {
        if(n == 0)
            return 1;
        else if( n == 1)
            return x;
        else if(n%2 == 0)
        {
            return getPow(x*x ,n/2);
        }
        else if(n%2 == 1)
        {
            return x*getPow(x,n-1);
        }
        else
        {
            return 1/getPow(x,-n);
        }
        
    }
    public double myPow(double x, int n) {
            
        
        double ans = getPow(x,n);
        
        return ans;
        
    }
}