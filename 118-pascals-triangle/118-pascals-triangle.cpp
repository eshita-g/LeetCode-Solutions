class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        
        vector<vector<int>> A;
        for(int line = 1;line<=numRows;line++)
        {
            int c= 1;
            vector<int> B;
            for(int i=1;i<=line;i++)
            {
                B.push_back(c);
                c = c*(line - i)/i;
            }
            A.push_back(B);
        }
        return A;
        
    }
};