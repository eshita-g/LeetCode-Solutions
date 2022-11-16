class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int i = 0;
        while(i<flowerbed.length) 
        {
            int left = 1;
            int right = 1;
            if(flowerbed[i] == 0)
            {
              if( i == 0 || flowerbed[i-1] == 0)
              {
                  left = 0;
              }
              if(i == flowerbed.length - 1 || flowerbed[i+1] == 0)
              {
                  right = 0;
              }
                if(left == 0 && right == 0)
                {
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }
        
        if(n > 0)
            return false;
        
        return true;
        
    }
}