class Solution {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        
      int  i = startPos[0];
      int  j = startPos[1];
      int x = homePos[0];
      int y = homePos[1];
      int res = 0;  
        while(i!= x)
        {
            i+= (x-i)/Math.abs(x-i);
            res = res + rowCosts[i];
        }
        while(j!=y)
        {
            j+=(y-j)/Math.abs(y-j);
            res = res+colCosts[j];
        }
        
        return res;
    }
}