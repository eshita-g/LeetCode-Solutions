class Find implements Comparator<int[]>{
    
    public int compare(int[] a,int[] b)
    {
        int d1 = a[0]*a[0] + a[1]*a[1];
        int d2 = b[0]*b[0] + b[1]*b[1];
        
        if(d1 > d2)
            return 1;
        else if(d1 < d2)
            return -1;
        
        return 0;
        
    }
}
class Solution {
    
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> q = new PriorityQueue<>(new Find());
        for(int[] i:points)
        {
            q.add(i);
        }
        int res[][] = new int[k][2];
        int j = 0;
        while(k > 0)
        {
            res[j] = q.poll();
            j++;
            k--;
        }
        
        return res;
        
    }
}