class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& score) {
        priority_queue<int> A;
        for(int i=0;i<score.size();i++)
        {
            A.push(score[i]);
        }
        unordered_map<int,int> B;
        int i = 1;
        while(!A.empty())
        {
            B[A.top()] = i;
            i++;
            A.pop();
        }
        vector<string> C;
        for(int i=0;i<score.size();i++)
        {
            if(B.find(score[i]) != B.end())
            {
                if(B[score[i]] > 3)
                {
                    C.push_back(to_string(B[score[i]]));
                }
                else if(B[score[i]] == 2)
                {
                    C.push_back("Silver Medal");
                    
                }
                else if(B[score[i]] == 1)
                {
                    C.push_back("Gold Medal");
                    
                }
                else
                {
                    C.push_back("Bronze Medal");
                    
                }
                
            }
        }
        
        return C;
        
    }
};