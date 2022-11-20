//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        //code here
        
        int[] res = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                res[i] = Math.max(res[i],price[j-1]+res[i-j]);
            }
        }
        
        return res[n];
    }
}