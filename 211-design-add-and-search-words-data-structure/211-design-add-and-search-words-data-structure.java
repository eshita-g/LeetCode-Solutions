class Trie{
    
    boolean end;
    Trie[] child = new Trie[26];
    
}
class WordDictionary {
    
    Trie root;

    public WordDictionary() {
        
        root = new Trie();
    }
    
    public void addWord(String word) {
        
        int n = word.length();
        Trie temp = root;
        for(int i=0;i<n;i++)
        {
            if(temp.child[word.charAt(i) - 'a'] == null)
            {
                temp.child[word.charAt(i) - 'a'] = new Trie();
            }
            temp = temp.child[word.charAt(i) - 'a'];
        }
        temp.end  = true;
    }
    
    public boolean search(String word)
    {
              return search(word,root);

    }
    
    public boolean search(String word,Trie root) {
        
        int n = word.length();
        for(int i=0;i<n;i++)
        {
            if(word.charAt(i) == '.')
            {
                for(int j=0;j<26;j++)
                {
                    
                    if(root.child[j] != null && search(word.substring(i+1),root.child[j]))
                    {
                        return true;
                    }
                
                
                }
                return false;
            }
            if(root.child[word.charAt(i) - 'a'] == null)
            {
                return false;
                
            }
            root = root.child[word.charAt(i) - 'a'];
        }
        
        if(root.end)
            return true;
        
        return false;
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */