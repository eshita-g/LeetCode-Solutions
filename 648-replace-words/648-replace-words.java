class Trie{
    
    Trie[] child = new Trie[26];
    String word;
    
}
class Solution {
    
    public String replaceWords(List<String> dictionary, String sentence) {
        
        int n = dictionary.size();
        Trie root = new Trie();
        for(int i=0;i<n;i++)
        {
            Trie temp = root;
            String s = dictionary.get(i);
            for(int j=0;j<s.length();j++)
            {
                if(temp.child[s.charAt(j) - 'a'] == null)
                {
                    temp.child[s.charAt(j) - 'a'] = new Trie();
                }
                temp = temp.child[s.charAt(j) - 'a'];
            }
            temp.word = s;
        }

        StringBuilder ans = new StringBuilder();
        for(String w : sentence.split("\\s+"))
        {
            if(ans.length() > 0)
            {
                ans.append(" ");
            }
            System.out.println(w);
            Trie temp = root;
            for(int i=0;i<w.length();i++)
            {
                if(temp.child[w.charAt(i) - 'a'] == null || temp.word != null)
                {
                 
                    
                    break;
                }
            
                temp = temp.child[w.charAt(i) - 'a'];
                    
            }
            ans.append(temp.word != null ? temp.word : w);
        }
        
        return ans.toString();
    }
}