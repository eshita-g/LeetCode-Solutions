class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(), l2 = text2.length();
        
        int[] prev = new int[l2 + 1];
        
        // Base Case
        // shifting index by 1
        for (int j = 0; j <= l2; j++) {
            prev[j] = 0;
        }
        
        for (int i = 1; i <= l1; i++) {
            int[] cur = new int[l2 + 1];
            
            for (int j = 1; j <= l2; j++) {
                
                // If match
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    cur[j] = 1 + prev[j - 1];
                }   
        
                // If not match
                else   cur[j] = Math.max(prev[j], cur[j - 1]);
            }
            prev = cur;
        }

        return prev[l2];
    
    }
}