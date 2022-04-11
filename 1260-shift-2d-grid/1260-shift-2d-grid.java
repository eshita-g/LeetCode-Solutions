class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] arr = new int[rows*cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                k = k% (rows * cols);
                arr[k] = grid[i][j];
                k++;
            }
        }
        List<List<Integer>> outer = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            List inner = new ArrayList<>();
            for(int j=0;j<grid[i].length;j++)
            {
                inner.add(arr[j+i*cols]);
            }
            outer.add(inner);
        }
        
        return outer;
    }
}