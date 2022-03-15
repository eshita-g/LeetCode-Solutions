class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashMap<Character,Integer> A = new HashMap<>();
        int count = 0;
        for(int i=0;i<allowed.length();i++)
        {
            A.put(allowed.charAt(i),0);
        }
        for(int i=0;i<words.length;i++)
        {
            boolean f = true;
            for(int j=0;j<words[i].length();j++)
            {
                if(!A.containsKey(words[i].charAt(j)))
                {
                    f = false;
                    break;
                }
            }
            if(f)
                count++;
        }
        
        return count;
    }
}