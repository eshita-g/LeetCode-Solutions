class Solution {
public:
    int deleteAndEarn(vector<int>& nums) {
        unordered_map<int,int> freq;
        int max_value = 0;
        for(int i=0;i<nums.size();i++)
        {
            freq[nums[i]]++;
            max_value = max(max_value, nums[i]);
        }
    // cout<<freq[1];

	vector<int> dp(max_value+1);

	dp[1] = freq[1];

	for(int i=2;i<=max_value;i++){
		//store max value in each dp[i]
		dp[i] = max(i*freq[i]+dp[i-2], dp[i-1]);
	}

	return dp[max_value]; 
}
};