class Solution {
    public void recurse(int in,int target,int[] arr,List<List<Integer>> res,List<Integer> temp)
    {
        if(target == 0)
        {
            res.add(new ArrayList<>(temp));
        }
        for(int i=in;i<arr.length;i++)
        {
            if( i > in && arr[i] == arr[i-1])
                continue;
            if(arr[i] > target)
                break;
            temp.add(arr[i]);
            recurse(i+1,target-arr[i],arr,res,temp);
            temp.remove(temp.size() - 1);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        recurse(0,target,candidates,res,temp);
        
        return res;
    }
}