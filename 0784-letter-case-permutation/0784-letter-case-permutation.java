class Solution {
    public List<String> letterCasePermutation(String s) {
        
        String str = "";
        List<String> res = new ArrayList<>();
        helper(0,res,s,str);
        
        return res;
        
    }
    public void helper(int i,List<String> res,String s,String str){
        
        if(i == s.length()){
            res.add(str);
            return;
        }
        char c = s.charAt(i);
        if(Character.isLetter(c)){
            
            if(Character.isUpperCase(c)){
               helper(i+1,res,s,str+c);
               c = Character.toLowerCase(c);
               helper(i+1,res,s,str+c); 
            }
            else{
                helper(i+1,res,s,str+c);
                c = Character.toUpperCase(c);
                helper(i+1,res,s,str+c); 
            }
        }else{
            helper(i+1,res,s,str+c);

        }
    }
}