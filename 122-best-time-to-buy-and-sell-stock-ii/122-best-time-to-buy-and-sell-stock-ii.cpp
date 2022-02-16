class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int max  = 0;
        int n = prices.size();
        for(int i=0;i<n-1;i++)
        {
            if(prices[i] < prices[i+1])
            {
                max  = max + (prices[i+1] - prices[i]);
            }
            
        }
        
        return max;
        
    }
};