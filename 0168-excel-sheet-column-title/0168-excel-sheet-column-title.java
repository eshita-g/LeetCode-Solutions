class Solution {
    public String convertToTitle(int c) {
        
       StringBuilder sb = new StringBuilder();
       int rem = 0;
       while(c > 0){
           
           c--;
           rem = c % 26;
           sb.append((char)(rem + 65));
           c = c/26;
       }
        
       return sb.reverse().toString(); 
        
    }
}