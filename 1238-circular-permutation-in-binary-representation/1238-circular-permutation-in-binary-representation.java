class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        
         List<String> res = helper(n);
        List<Integer> ans = new ArrayList<>();
        for(String s : res){
            
            ans.add(Integer.parseInt(s,2));
        }
        List<Integer> perm = new ArrayList<>();
        int i =0;
        for(i=0;i<ans.size();i++){
            if(ans.get(i) == start){
                break;
            }
        }
        for(int j=i;j<ans.size();j++){
            perm.add(ans.get(j));
            
        }
        for(int j=0;j<i;j++){
            perm.add(ans.get(j));
            
        }
        
        return perm;
        
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