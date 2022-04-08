class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] A = new int[n];
        int p = bookings.length;
        for(int i=0;i<p;i++)
        {
            int a = bookings[i][0] - 1;
            int b = bookings[i][1] - 1;
            while(a<=b)
            {
                A[a] = A[a] + bookings[i][2];
                a++;
            }
        }
        
        return A;
    }
}