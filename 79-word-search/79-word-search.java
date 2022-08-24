class Solution {
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(dfs(board,i,j,word,0))
                    return true;
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,int r,int c,String word,int idx)
    {
        if(idx >= word.length())
            return true;
        if(r<0 || r>=board.length || c<0 || c>=board[0].length || board[r][c] == '0')
            return false;
        
        boolean ans = false;
        if(board[r][c] == word.charAt(idx))
        {
            char t = board[r][c];
            board[r][c] = '0';
            ans = dfs(board,r+1,c,word,idx+1) || dfs(board,r,c+1,word,idx+1) || dfs(board,r-1,c,word,idx+1) || dfs(board,r,c-1,word,idx+1);
            
            
            board[r][c] = t;
        }
        
        return ans;
    }
}