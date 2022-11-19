//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.numberOfWays(N));
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long numberOfWays(int N) {
        // code here
        if(N==1)
        {
            return 1L;
        }
        if(N == 2)
        {
            return 2L;
        }
        long[] res = new long[N+1];
        res[1]  = 1;
        res[2] = 2;
        long m = 1000000007;
        for(int i=3;i<=N;i++)
        {
             res[i] = (res[i-1]%m + res[i-2]%m)%m;
        }
        
        return res[N];
    }
};