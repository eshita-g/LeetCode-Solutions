class Solution {
    public void rightRotate(int i,int j,int[] nums)
    {
        int key = nums[j];
        for(int k=j-1;k>=i;k--)
        {
            nums[k+1] = nums[k];
        }
        nums[i] = key;
    }
    public void leftRotate(int i,int j,int[] nums)
    {
        int key  = nums[i];
        for(int k=i+1;k<=j;k++)
        {
            nums[k-1] = nums[k];
            
        }
        nums[j] = key;
    }
    
    public void permute(ArrayList<String> res,int[] nums,int i,int p)
    {
        if(res.size() == p)
            return;
        if(i == nums.length)
        {
            int val = 0;
            for(int k=0;k<nums.length;k++)
            {
                val = val * 10 + nums[k];
            }
            String s = String.valueOf(val);
            res.add(s);
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            rightRotate(i,j,nums);
            permute(res,nums,i+1,p);
            leftRotate(i,j,nums);
        }
    }
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = i+1;
        }
        ArrayList<String> res = new ArrayList<>();
        permute(res,nums,0,k);
        String s = res.get(k-1);
        
        return s;
    }
}