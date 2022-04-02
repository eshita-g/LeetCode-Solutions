class Solution {
    public void duplicateZeros(int[] arr) {
        
        int n = arr.length;
        for(int i=0;i<=n-2;i++)
        {
              if(arr[i] == 0)
              {
                  int j = i + 1;
                  int t = n-2;
                  while(t >= j)
                  {
                      arr[t+1] = arr[t];
                      t--;
                  }
                  arr[j] = 0;
                  i = i+1;
              }
        }
        
    }
}