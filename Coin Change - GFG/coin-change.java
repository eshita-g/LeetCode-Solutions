//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long numWay(int i,int sum,int[] coins,long[][] res)
    {
        if(sum == 0)
        {
            return 1;
        }
        if(sum < 0)
        {
         return 0;
        }
        
        if(i < 0)
        {
          return 0;
        }  
        
        if(res[i][sum] != -1)
        {
            return res[i][sum];
        }
        
        res[i][sum] = numWay(i-1,sum,coins,res) + numWay(i,sum-coins[i],coins,res);
        
        
        ///System.out.println(res[i][sum]);
        return res[i][sum];
    }
    public long count(int coins[], int N, int sum) {
        // code here.
        
        long[][] res = new long[N][sum+1];
        for(long[] row : res)
        {
            Arrays.fill(row,-1);
        }
        
        numWay(N-1,sum,coins,res);
        
        return res[N-1][sum];
    }
}