//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Pair{
    
    int node;
    int distance;
    Pair(int node,int distance)
    {
        this.node = node;
        this.distance = distance;
    }
}

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        
        PriorityQueue<Pair> q = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        q.add(new Pair(0,0));
        int sum = 0;
        int[] vis = new int[V];
        while(!q.isEmpty())
        {
            Pair p = q.remove();
            int i =p.node;
            int k = p.distance;
            
            if(vis[i] == 1) {
                continue;
            }
            
            vis[i] = 1;
            sum = sum + k;
            for(int j=0;j<adj.get(i).size();j++)
            {
                int wt = adj.get(i).get(j).get(1);
                int adjNode = adj.get(i).get(j).get(0);
                
                if(vis[adjNode] == 0)
                {
                    q.add(new Pair(adjNode,wt));
                }
            }
        }
        
        return sum;
    }
}
