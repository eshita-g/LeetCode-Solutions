class Solution {
    public int binary(int[] arr)
    {
        int low = 0;
        int end = arr.length - 1;
        while(low <= end)
        {
            int mid = (low + end)/2;
            if(arr[mid] == 1)
            {
                if(mid == arr.length - 1 || arr[mid] != arr[mid+1])
                {
                    return mid;
                }
                else
                {
                    low = mid + 1;
                }
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
        
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int n = mat.length;
        int[][] dp = new int[n][2];
        int soldiers = 0;
        for(int i=0;i<n;i++)
        {
            soldiers = binary(mat[i]) + 1;
            dp[i][0] = soldiers;
            dp[i][1] = i;
        }
        Arrays.sort(dp,(a,b) -> a[0] - b[0]);
        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = dp[i][1];
        }
        
        return res;
    }
}