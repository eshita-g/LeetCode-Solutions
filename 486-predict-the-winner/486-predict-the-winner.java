class Solution {
public boolean PredictTheWinner(int[] nums) {
        
        int n=nums.length;
        return Helper(nums,0,n-1,true,0,0);
    }
    
    boolean Helper(int[] nums, int i,int j,boolean pTurn,int p1,int p2)
    {
        
        if(i > j)
        {
           return p1>=p2?true:false;
        }
        if(pTurn)
        {
            return Helper(nums,i+1,j,!pTurn,p1+nums[i],p2) || Helper(nums,i,j-1,!pTurn,p1+nums[j],p2);
        }
        else
        {
            return Helper(nums,i+1,j,!pTurn,p1,p2+nums[i]) && Helper(nums,i,j-1,!pTurn,p1,p2+nums[j]);
        }
        
    }
}