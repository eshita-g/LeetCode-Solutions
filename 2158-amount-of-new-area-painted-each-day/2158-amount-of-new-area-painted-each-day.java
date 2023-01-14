class Solution {
    public int[] amountPainted(int[][] paint) {
        
        int[] line = new int[50001];
        int[] res = new int[paint.length];
        for(int i=0;i<paint.length;i++)
        {
            int start = paint[i][0];
            int end = paint[i][1];
            int painting = 0;
            while(start < end)
            {
                int nextJump = Math.max(line[start],start+1);
                painting += line[start] == 0 ? 1 : 0;
                line[start] = Math.max(line[start],end);
                start = nextJump;
            }
            res[i] = painting;
        }
        
        return res;
        
    }
}