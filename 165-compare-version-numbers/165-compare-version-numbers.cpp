class Solution {
public:
    int compareVersion(string version1, string version2) {
        vector <int> A;
        string s1 = "";
        for(int i=0;i<version1.size();i++)
        {
            if(version1[i] == '.')
            {
                int a = stoi(s1);
                A.push_back(a);
                s1 = "";
            }
            else
            {
                s1 = s1 + version1[i];
            }
        }
        A.push_back(stoi(s1));
        string s2 = "";
        vector<int> B;
        for(int i=0;i<version2.size();i++)
        {
            if(version2[i] == '.')
            {
                int b = stoi(s2);
                B.push_back(b);
                s2 = "";
            }
            else
            {
                s2 = s2 + version2[i];
            }
        }
        B.push_back(stoi(s2));
        int n1 = A.size();
        int n2 = B.size();
        if(n1 < n2)
        {
            while(n1!=n2)
            {
                A.push_back(0);
                n1++;
            }
        }
        else 
        {
            while(n2 != n1)
            {
                B.push_back(0);
                n2++;
            }
        }
        int  p = 0;
        for(int i=0;i<n1;i++)
        {
            cout<<A[i]<<" "<<B[i];
            
            if(A[i] < B[i])
            {
                p = -1;
                break;
            }
            else if(A[i] > B[i])
            {
                p = 1;
                break;
            }
            else
            {
                p = 0;
            }
            
        }
        return p;
            
    }
};