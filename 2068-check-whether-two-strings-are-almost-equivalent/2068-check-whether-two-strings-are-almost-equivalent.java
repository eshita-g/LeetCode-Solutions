class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> A = new HashMap<>();
        for(char c: word1.toCharArray())
        {
            if(A.containsKey(c))
            {
                A.put(c,A.get(c)+1);
            }
            else
            {
                A.put(c,1);
            }
        }
        HashMap<Character,Integer> B = new HashMap<>();
        for(char c: word2.toCharArray())
        {
            if(B.containsKey(c))
            {
                B.put(c,B.get(c)+1);
            }
            else
            {
                B.put(c,1);
            }
        }
        int count = 0;
        for(Character c: A.keySet())
        {
            if(B.containsKey(c))
            {
                count = Math.abs(A.get(c) - B.get(c));
            }
            else
            {
                count = A.get(c);
            }
            if(count > 3)
                return false;
            
            count = 0;
        }
        for(Character c: B.keySet())
        {
            if(A.containsKey(c))
            {
                count = Math.abs(A.get(c) - B.get(c));
            }
            else
            {
                count = B.get(c);
            }
            if(count > 3)
                return false;
            
            count = 0;
        }
        
        return true;
        
        
    }
}