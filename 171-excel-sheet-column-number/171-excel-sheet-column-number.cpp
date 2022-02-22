class Solution {
public:
    int titleToNumber(string s) {
        int n  = s.size();
        int res = 0;
        for(int i=0;i<n;i++)
        {
          int a = s[i] - 'A' + 1;
          res = res * 26 + a;  
        }
        
        return res;
        
    }
};