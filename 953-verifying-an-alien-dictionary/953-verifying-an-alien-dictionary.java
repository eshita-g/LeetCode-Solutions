class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character,Integer> A = new HashMap<Character,Integer>();
        for(int i=0;i<order.length();i++)
        {
            A.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length-1;i++)
        {
            String cur = words[i];
            String next = words[i+1];
            if(cur.equals(next))
                continue;
            
            int l = 0;
            int r = 0;
            while(l < cur.length()  && r<next.length())
            {
                if(A.get(cur.charAt(l)) < A.get(next.charAt(r)))
                    break;
                if(A.get(cur.charAt(l)) > A.get(next.charAt(r)))
                    return false;
                l++;
                r++;
            }
            if(l < cur.length() && r == next.length())
                return false;
        }
        
        return true;
    }
}