class Solution {
    public int minBitFlips(int start, int goal) {
        
        int res = start ^ goal;
        int c = 0;
        while(res > 0){
         
            c = c + (res & 1);
            res = res >> 1;
        }
        return c;
        
    }
}