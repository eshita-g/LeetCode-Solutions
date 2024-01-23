class Solution {
    public int maxLength(List<String> arr) {
        
      return helper(arr,0,"");  
        
    }
    public static int helper(List<String> arr,int i,String res){
        
        if(i == arr.size()){
            if(isValid(res)){
                return res.length();
            }
            return 0;
        }
        
        int left = helper(arr,i+1,res+arr.get(i));
        int right = helper(arr,i+1,res);
        
        return Math.max(left,right);
    }
    
    public static boolean isValid(String s){
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))
                return false;
            set.add(s.charAt(i));
        }
        return true;
    }
    
}