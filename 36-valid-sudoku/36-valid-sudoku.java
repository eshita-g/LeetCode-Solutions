class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean res = solve(board);
        
        
        return res;
    }
    
    public boolean solve(char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j] != '.')
                {
                    char c = board[i][j];
                        if(isValid(board,i,j,c) == false)
                        {
                            return false;
                        }
                    
                    
            
                }
                
            }
        }
        return true;
    }
    
    public boolean isValid(char[][] board,int row,int col,char c)
    {
        int count = -2;
        for(int i=0;i<9;i++)
        {
            if(board[row][i] == c)
            {
                if(count == 1)
                    return false;
                
                count++;
            }
            
            if(board[i][col] == c)
            {
                if(count == 1)
                    return false;
                
                count++;
            }
            
            if(board[3 * (row/3) + i/3][3 * (col/3) + i%3] == c)
            {
                if(count == 1)
                    return false;
                
                count++;
            }
        }
        return true;
    }
    
}