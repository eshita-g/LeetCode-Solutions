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
class Edge implements Comparable<Edge>{

    int src;
    int dest;
    int wt;
    Edge(int src,int dest,int wt)
    {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }
    public int compareTo(Edge compareEdge){
     
     return this.wt - compareEdge.wt;   
    }
}
class Solution
{
    public static int findPar(int u,int[] par)
    {
        while(par[u] != u)
        {
            u = par[u];
        }
        
        return u;
    
    }
    public static void union(int u,int v,int[] par,int[] size)
    {
        u = findPar(u,par);
        v = findPar(v,par);
        if(size[u] > size[v])
        {
            par[v] = u; 
            size[u] = size[u] + size[v];
        }
        else
        {
            par[u] = v;
            size[v] = size[u] + size[v];
        }
    }
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        List<Edge> edges = new ArrayList<>();
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<adj.get(i).size();j++)
            {
                int adjNode =adj.get(i).get(j).get(0);
                int wt = adj.get(i).get(j).get(1);
                Edge temp = new Edge(i,adjNode,wt);
                edges.add(temp);
            }
        }
        Collections.sort(edges);
        int[] par = new int[V];
        int[] size = new int[V];
        for(int i=0;i<V;i++)
        {
            par[i] = i;
            size[i] = 1;
        }
        int cost = 0;
        for(int i=0;i<edges.size();i++)
        {
            int a = edges.get(i).src;
            int b = edges.get(i).dest;
            
            if(findPar(a,par) != findPar(b,par))
            {
                cost = cost + edges.get(i).wt;
                union(a,b,par,size);
            }
        }
        
        return cost;
    }
}
