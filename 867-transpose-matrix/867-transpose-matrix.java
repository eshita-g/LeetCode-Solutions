class Solution {
    public int[][] transpose(int[][] matrix) {
        int m  = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[n][m];
        int temp;
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
               res[i][j] = matrix[j][i];
            }
        }
        
        return res;
        
    }
}