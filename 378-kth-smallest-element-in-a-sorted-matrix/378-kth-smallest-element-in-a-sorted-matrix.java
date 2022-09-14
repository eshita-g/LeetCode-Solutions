class Find implements Comparator<int[]>{
    public int compare(int[] a,int[] b)
    {
        if(a[2] > b[2])
            return 1;
        else if(a[2] < b[2])
            return -1;
        
        return 0;
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        int n = matrix.length;
        PriorityQueue<int[]> q = new PriorityQueue<>(new Find());
        for(int i=0;i<n;i++)
        {
            q.add(new int[]{i,0,matrix[i][0]});
        }
        int ans =0;
        while(k > 0)
        {
            int[] cur = q.poll();
            ans = cur[2];
            int i = cur[0];
            int j = cur[1];
            if(j+1 < n)
            {

                q.add(new int[]{i,j+1,matrix[i][j+1]});
            }
            k--;
        }
        return ans;
    }
}