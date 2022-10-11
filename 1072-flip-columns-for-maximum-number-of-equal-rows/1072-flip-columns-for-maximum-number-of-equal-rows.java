class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        
        int res = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++)
        {
            int cnt = 0;
            int[] flip = new int[n];
            for(int j=0;j<n;j++)
            {
                flip[j] = 1 - matrix[i][j];
            }
            for(int k=i;k<m;k++)
            {
                if(Arrays.equals(matrix[i],matrix[k]) || Arrays.equals(matrix[k],flip) )
                    cnt++;
            }
            res = Math.max(res,cnt);
        }
        
        return res;
        
    }
}