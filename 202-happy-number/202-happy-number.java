class Solution {
    public int getSum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int d = n%10;
            n = n = n /10;
            sum = sum + d*d;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        while(n!= 1 && !s.contains(n))
        {
            s.add(n);
            n = getSum(n);
        }
        
        return n==1;
    }
}