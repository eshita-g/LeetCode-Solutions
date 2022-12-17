//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends

class Pair{
    
    int row;
    int col;
    int dis;
    
    Pair(int row,int col,int dis)
    {
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}
class Solution
{
    public boolean isValid(int r,int c,int N)
    {
        if(r>0 && r<=N && c>0 && c<=N)
        {
            return true;
        }
        return false;
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int[][] vis = new int[N+1][N+1];
        int[][] dir = {{2,1},{2,-1},{-2,1},{-2,-1},{1,2},{1,-2},{-1,2},{-1,-2}};
        
        vis[KnightPos[0]][KnightPos[1]] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(KnightPos[0],KnightPos[1],0));
        while(!q.isEmpty())
        {
            Pair p = q.remove();
            
            if(p.row == TargetPos[0] && p.col == TargetPos[1])
            {
                return p.dis;
            }
            for(int i=0;i<dir.length;i++)
            {
                int newRow = p.row + dir[i][0];
                int newCol = p.col + dir[i][1];
                int dis = p.dis;
                
                if(!isValid(newRow,newCol,N))
                {
                    continue;
                }
                if(vis[newRow][newCol] == 0)
                {
                    vis[newRow][newCol] = 1;
                    q.add(new Pair(newRow,newCol,dis+1));
                }
            }
        }
        return -1;
        
    }
}