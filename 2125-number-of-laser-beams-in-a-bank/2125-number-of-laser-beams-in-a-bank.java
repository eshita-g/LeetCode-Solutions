class Solution {
    public int numberOfBeams(String[] bank) {
        
        if(bank.length < 2)
            return 0;
        
        int n = bank.length;
        int res = 0;
        int prev = 0;
        int current = 0;
        for(int i=0;i<n;i++){
            
            String s = bank[i];
            int j = 0;
            current = 0;
            while(j<s.length()){
                if(s.charAt(j) == '1'){
                    current++;
                }
                j++;
            }
            res = res + prev*current;
            prev = current == 0 ? prev : current;
            
        }
        
        return res;
        
        
    }
}