class Solution {
    public int minOperations(int n) {
        
        int[] arr;
        arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = 2*i + 1;
            sum = sum + arr[i];
        }
        int p = sum/n;
        int count = 0;
        for(int i=0;i<n/2;i++)
        {
            count = count + (p-arr[i]);
        }
        
        return count;
    }
}