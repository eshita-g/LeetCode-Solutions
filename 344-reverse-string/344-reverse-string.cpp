class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();
        char ch;
        for(int i=0;i<n/2;i++)
        {
            ch = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = ch;
            
        }
        
    }
};