class Solution {
    public int maxChunksToSorted(int[] arr) {
        
        int n = arr.length;
        int c = 0;
        int m = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            m = Math.max(m,arr[i]);
            if( m == i)
            {
                c = c+1;
            }
        }
        
        return c;
    }
}