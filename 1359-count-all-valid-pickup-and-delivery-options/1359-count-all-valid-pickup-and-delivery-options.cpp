class Solution {
public:
    int countOrders(int n) {
        long mod = (long)pow(10,9) + 7;
        long res = 1;
        for(int i =1;i<=n;i++)
        {
            res = res*i;
            res = res%mod;
            res = res*(2*i-1);
            res = res%mod;
        }
        
        return res;
        
    }
};