class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        int min = prices[0];
        int profit =0;
        for(int i=1;i<n;i++)
        {
            min = std::min(min,prices[i]);
            profit = std::max(profit, prices[i]-min);

        }
        return profit;
    }
};