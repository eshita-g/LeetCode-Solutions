class Solution {
    public int divide(int dividend, int divisor) {
        
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
         if (dividend == Integer.MIN_VALUE && divisor == 1) {
            return Integer.MIN_VALUE;
        }
        
        long sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        
        
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        
        int quotient = 0;
        while(dvd >= dvs){
             long temp = dvs, multiple = 1;

            // Finding the largest multiple of divisor that can be subtracted from dividend without making it negative
            while (dvd >= (temp << 1)) {
                temp <<= 1;      // Doubling the value of temp
                multiple <<= 1;  // Doubling the value of multiple to keep track of how many times temp was doubled
            }

            dvd -= temp;     // Subtracting the largest multiple from dividend
            quotient += multiple;  
        }
        if(sign == -1)
            quotient = -quotient;
        
        return quotient;
        
        
    }
}