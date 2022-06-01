class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> A =new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            A.put(c,A.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            if(A.get(s.charAt(i)) == 1)
            {
                return i;
            }
        }
        
        return -1;
        
    }
}