class Solution {
    int count = 0;
    public int numTilePossibilities(String tiles) {
        
        int n = tiles.length();
        int[] freq = new int[26];
        for(char ch : tiles.toCharArray())
        {
            freq[ch - 'A']++;
        }
        generateSeq(freq);
            
            
        return count-1;
        
    }
       
    public void generateSeq(int[] freq)
    {
        count++;
        for(int i=0; i<26;i++)
        {
            if(freq[i] == 0)
                continue;
            freq[i]--;
            generateSeq(freq);
            freq[i]++;
        }
    
}}