class Trie {

    class TrieNode {
        boolean end;
        TrieNode[] children = new  TrieNode[26];
    }
    TrieNode root;
    public Trie() {
        
           root = new TrieNode();
    }
    
    public void insert(String word) {
        
        int len = word.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++)
        {
            if(temp.children[word.charAt(i) - 'a'] == null)
            {
                temp.children[word.charAt(i) - 'a'] = new TrieNode();
            }
            temp = temp.children[word.charAt(i) - 'a'];
        }
        temp.end = true;
        
    }
    
    public boolean search(String word) {
        int len = word.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++)
        {
            if(temp.children[word.charAt(i)-'a'] == null)
            {
                return false;
            }
            temp = temp.children[word.charAt(i) - 'a'];
        }
        return temp.end;
        
    }
    
    public boolean startsWith(String prefix) {
        
        int len = prefix.length();
        TrieNode temp = root;
        for(int i=0;i<len;i++)
        {
            if(temp.children[prefix.charAt(i) - 'a'] == null)
                return false;
            
            temp = temp.children[prefix.charAt(i) - 'a'];
        }
        
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */