class Solution {
    public long[] sumOfThree(long num) {
        
        long[] res = new long[3];
        long d = (long)num/3;
        res[0] = d - 1;
        res[1] = d;
        res[2] = d + 1;
        if((res[0] == res[1]) || (res[1] == res[2]) || (res[2] == res[0]) || (res[0] + res[1] + res[2] !=num))
        {
            long[] ans = new long[0];
            return ans;
        }
        
        return res;
    }
}