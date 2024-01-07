class Solution {
    public int hammingDistance(int x, int y) {
        
        int count = 0;
        while(x!=0 || y!=0){
            int a = 0;
            int b = 0;
            if((x&1) == 1) a++;
            if((y&1) == 1) b++;
            if(a!=b) count++;
            x>>=1;
            y>>=1;
        }
        
        return count;
        
    }
}