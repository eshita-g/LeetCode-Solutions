//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    
    boolean res = false;
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code herent
        
        int[] vis = new int[V];
        for(int i=0;i<V;i++)
        {
            if(vis[i] == 0)
            {
                dfs(i,vis,adj);
            }
        }
        
        return res;
    }
    public void dfs(int i,int[] vis,ArrayList<ArrayList<Integer>> adj)
    {
        if(vis[i] == 1 || vis[i] == 2)
        {
        if(vis[i] == 1 )
        {
            res = true;
            
        }
        return;
        }
        vis[i] = 1;
        for(int j=0;j<adj.get(i).size();j++)
        {
            dfs(adj.get(i).get(j),vis,adj);
        }
        vis[i] = 2;
    }
}