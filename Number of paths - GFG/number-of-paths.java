//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int m = Integer.parseInt(inputLine[0]);
		    int n = Integer.parseInt(inputLine[1]);
		    Solution ob = new Solution();
		    System.out.println(ob.numberOfPaths(m, n));
		}
	}
}




// } Driver Code Ends


class Solution{
    long countPaths(int i,int j,int m,int n)
    {
        if(i == m-1 || j == n-1)
        {
            return 1;
        }
        
        return countPaths(i+1,j,m,n) + countPaths(i,j+1,m,n);
    }
    
    long numberOfPaths(int m, int n) {
        // Code Here
        
       
       return countPaths(0,0,m,n);            
        
    }
    
}