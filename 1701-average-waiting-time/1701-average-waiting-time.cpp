class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        int n = customers.size();
        double start = 0;
        double wait = 0;
        for(int i=0;i<n;i++)
        {
            if(customers[i][0] > start)
            {
                 wait = wait + customers[i][1];
                start = customers[i][0] + customers[i][1];
                
                
            }
            else
            {
                 wait = wait + start + customers[i][1] - customers[i][0];
                 start = start + customers[i][1];
                
              
                
            }
        }
        
        return wait/n;
    }
};