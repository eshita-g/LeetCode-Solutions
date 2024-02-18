class Solution {
    public List<Integer> grayCode(int n) {
        
        List<String> res = helper(n);
        List<Integer> ans = new ArrayList<>();
        for(String s : res){
            
            ans.add(Integer.parseInt(s,2));
        }
        
        return ans;
        
    }
    
    List<String> helper(int n){
        
        if(n==1){
            List<String> res = new ArrayList<>();
            res.add("0");
            res.add("1");
            return res;
        }
        
        List<String> res = helper(n-1);
        List<String> ans = new ArrayList<>();
        for(int i=0;i<res.size();i++){
            ans.add("0" + res.get(i));
        }
        for(int i=res.size()-1;i>=0;i--){
            ans.add("1" + res.get(i));
        }
        return ans;
        
    }
}