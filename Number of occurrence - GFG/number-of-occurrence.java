//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        
        int first = -1;
        int l = 0;
        int r = n-1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(arr[m] > x)
            {
                r = m-1;
            }
            else if(arr[m] < x)
            {
                l = m + 1;
            }
            else
            {
                first = m;
                r = m - 1;
            }
        }
        if(first == -1)
        {
            return 0;
        }
        int second = 0;
        l = 0;
        r = n -1;
        while(l <= r)
        {
            int m = (l+r)/2;
            if(arr[m] > x)
            {
                r = m - 1;
                
            }
            else if(arr[m] < x)
            {
                l = m+1;
            }
            else
            {
                second = m;
                l = m+1;
            }
        }
        
        return second-first+1;
    }
}