class Solution {
    public void comb(int start,int num,int low,int high,ArrayList<Integer> res)
    {
        if(num > high || start > 10)
            return;
        if(num >= low && num<=high)
        {
            res.add(num);
            
        }
        comb(start+1,num*10 + start,low,high,res);
        
    }
    public List<Integer> sequentialDigits(int low, int high) {
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            comb(i,0,low,high,res);
        }
        
        Collections.sort(res);
        return res;
    }
}