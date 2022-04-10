class Solution {
public:
    int calPoints(vector<string>& ops) {
        int n = ops.size();
        int p,t,a;
        stack<int> A;        
        for(string op:ops)
        {
            if( op == "C")
            {
                A.pop();
            }
            else if(op == "D")
            {
                p = A.top();
                p = p * 2;
                A.push(p);
            }
            else if(op == "+")
            {
                 t = A.top();
                 A.pop();
                 a = A.top();
                 a = t + a;
                 A.push(t);
                 A.push(a);
            }
            else
            {
                int d = stoi(op);
                A.push(d);
            }
        }
        int sum = 0;
        while(A.size() > 0)
        {
            sum = sum + A.top();
            A.pop();
        }
        return sum;
        
    }
};