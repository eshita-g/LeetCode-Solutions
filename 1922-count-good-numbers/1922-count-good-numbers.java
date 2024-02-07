class Solution {
    
    private long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        
       long even = (n+1)/2;
       long odd = n/2;
       long evenPow = pow(5,even)%MOD;
       long oddPow = pow(4,odd)%MOD;
        
       return (int)((evenPow*oddPow)%MOD); 
           
    }
    private long pow(long n,long k){
        if(k == 0)
            return 1;
        
        long x = pow(n,k/2);
        
        if(k%2 == 0)
            return (x * x)%MOD;
        
        return n*(x*x)%MOD;
    }
}