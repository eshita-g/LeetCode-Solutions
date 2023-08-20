class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int m = s.length();
        int n = t.length();
        if(m!=n)
            return false;
        
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        
        for(int i=0;i<m;i++){
            
            int a = (int)s.charAt(i);
            int b = (int)t.charAt(i);
            
            if(arr1[a] == 0){
                arr1[a] = b;
            }
            else
            {
                if(arr1[a] != b)
                    return false;
            }
            if(arr2[b] == 0){
                arr2[b] = a;
            }
            else{
                if(arr2[b] != a){
                    return false;
                }
            }
        }
        
        return true;
       
        
    }
}