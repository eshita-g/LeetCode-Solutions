class Solution {
    int count  = 0;
    
    public void solve(int col,char[][] board,int[] leftRow,int[] lowerDiagnol,int[] upperDiagnol,int n)
    {
        if(col == n)
        {
            count++;
            return;
        }
        for(int row = 0;row<n;row++)
        {
            if(leftRow[row] == 0 && lowerDiagnol[row + col] == 0 && upperDiagnol[n-1 + col-row] == 0)          {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagnol[row + col] = 1;
                upperDiagnol[n-1 + col - row] = 1;
                solve(col+1,board,leftRow,lowerDiagnol,upperDiagnol,n);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagnol[row + col] = 0;
                upperDiagnol[n-1 + col - row] = 0;


            }
        }
        
    }
    public int totalNQueens(int n) {
        
    
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        }
        int[] leftRow = new int[n];
        int[] lowerDiagnol = new int[2*n - 1];
        int[] upperDiagnol = new int[2*n - 1];
        solve(0,board,leftRow,lowerDiagnol,upperDiagnol,n);
        
        return count;
    }
}