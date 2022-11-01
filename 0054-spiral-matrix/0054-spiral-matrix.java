class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> res = new ArrayList<>();
        int l = 0;
        int r = n-1;
        int t = 0;
        int b = m-1;
        int dir = 1;
        while(res.size() < m*n)
        {
            switch(dir){
                    
                case 1:
                    for(int i=l;i<=r;i++)
                    {
                        res.add(matrix[t][i]);
                    }
                    dir = 2;
                    t++;
                    break;
                 
                case 2:
                    for(int i=t;i<=b;i++)
                    {
                        res.add(matrix[i][r]);
                        
                    }
                    dir = 3;
                    r--;
                    break;
                    
                case 3:
                    for(int i=r;i>=l;i--)
                    {
                        res.add(matrix[b][i]);
                    }
                    dir = 4;
                    b--;
                    break;
                
                case 4:
                    for(int i=b;i>=t;i--)
                    {
                        res.add(matrix[i][l]);
                    }
                    dir = 1;
                    l++;
                    break;
                    
            }
        }
        
        return res;
        
    }
}